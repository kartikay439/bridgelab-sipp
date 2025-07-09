
class Book {
    String title;
    String author;
    String genre;
    int id;
    boolean available;
    Book next;
    Book prev;

    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

class Library {
    Book head = null;
    Book tail = null;

    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (head == null) head = tail = b;
        else {
            b.next = head;
            head.prev = b;
            head = b;
        }
    }

    void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (tail == null) head = tail = b;
        else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    void addAtPosition(String title, String author, String genre, int id, boolean available, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }
        Book b = new Book(title, author, genre, id, available);
        Book temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        b.next = temp.next;
        b.prev = temp;
        if (temp.next != null) temp.next.prev = b;
        temp.next = b;
        if (b.next == null) tail = b;
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + (temp.available ? "Available" : "Not Available"));
            }
            temp = temp.next;
        }
    }

    void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + (temp.available ? "Available" : "Not Available"));
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = available;
                break;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + (temp.available ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + (temp.available ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addAtEnd("Book A", "Author X", "Fiction", 1, true);
        lib.addAtBeginning("Book B", "Author Y", "History", 2, false);
        lib.addAtEnd("Book C", "Author X", "Science", 3, true);
        lib.addAtPosition("Book D", "Author Z", "Math", 4, true, 2);
        lib.displayForward();
        System.out.println("Reverse:");
        lib.displayReverse();
        System.out.println("Search by Title:");
        lib.searchByTitle("Book C");
        System.out.println("Search by Author:");
        lib.searchByAuthor("Author X");
        System.out.println("Update Availability:");
        lib.updateAvailability(2, true);
        lib.displayForward();
        System.out.println("Remove Book ID 3:");
        lib.removeById(3);
        lib.displayForward();
        System.out.println("Total Books: " + lib.countBooks());
    }
}
