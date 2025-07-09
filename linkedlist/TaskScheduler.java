class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null;
    Task tail = null;
    Task current = null;

    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = t;
            t.next = head;
        } else {
            t.next = head;
            head = t;
            tail.next = head;
        }
    }

    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = t;
            t.next = head;
        } else {
            tail.next = t;
            tail = t;
            tail.next = head;
        }
    }

    void addAtPosition(int id, String name, int priority, String dueDate, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task t = new Task(id, name, priority, dueDate);
        Task temp = head;
        for (int i = 0; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        if (temp == tail) tail = t;
    }

    void removeById(int id) {
        if (head == null) return;
        Task temp = head, prev = tail;
        do {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                if (current == temp) current = temp.next;
                if (head == tail && head.id == id) head = tail = null;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentAndMoveNext() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println(current.id + " " + current.name + " " + current.priority + " " + current.dueDate);
            current = current.next;
        }
    }

    void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
}
class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(1, "Task A", 2, "2025-07-10");
        scheduler.addAtBeginning(2, "Task B", 1, "2025-07-09");
        scheduler.addAtEnd(3, "Task C", 3, "2025-07-11");
        scheduler.addAtPosition(4, "Task D", 2, "2025-07-15", 2);
        scheduler.displayAllTasks();
        System.out.println("Current Task:");
        scheduler.viewCurrentAndMoveNext();
        System.out.println("Next Task:");
        scheduler.viewCurrentAndMoveNext();
        System.out.println("Search by Priority 2:");
        scheduler.searchByPriority(2);
        scheduler.removeById(2);
        scheduler.displayAllTasks();
    }
}
