class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    Item head = null;

    void addAtBeginning(String name, int id, int quantity, double price) {
        Item item = new Item(name, id, quantity, price);
        item.next = head;
        head = item;
    }

    void addAtEnd(String name, int id, int quantity, double price) {
        Item item = new Item(name, id, quantity, price);
        if (head == null) head = item;
        else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = item;
        }
    }

    void addAtPosition(String name, int id, int quantity, double price, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        Item item = new Item(name, id, quantity, price);
        Item temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        item.next = temp.next;
        temp.next = item;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantityById(int id, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                break;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
                break;
            }
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            }
            temp = temp.next;
        }
    }

    void totalValue() {
        Item temp = head;
        double sum = 0;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + sum);
    }

    Item merge(Item a, Item b, String key, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        boolean condition;
        if (key.equals("name")) condition = asc ? a.name.compareToIgnoreCase(b.name) < 0 : a.name.compareToIgnoreCase(b.name) > 0;
        else condition = asc ? a.price < b.price : a.price > b.price;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, key, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, key, asc);
        }
        return result;
    }

    Item middle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Item mergeSort(Item h, String key, boolean asc) {
        if (h == null || h.next == null) return h;
        Item mid = middle(h);
        Item nextMid = mid.next;
        mid.next = null;
        Item left = mergeSort(h, key, asc);
        Item right = mergeSort(nextMid, key, asc);
        return merge(left, right, key, asc);
    }

    void sortBy(String key, boolean asc) {
        head = mergeSort(head, key, asc);
    }

    void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addAtEnd("Apple", 101, 50, 10.5);
        inv.addAtBeginning("Banana", 102, 30, 5.0);
        inv.addAtEnd("Orange", 103, 20, 8.0);
        inv.addAtPosition("Mango", 104, 25, 15.0, 2);
        inv.display();
        System.out.println("Search by ID:");
        inv.searchById(103);
        System.out.println("Search by Name:");
        inv.searchByName("Mango");
        System.out.println("Total Value:");
        inv.totalValue();
        System.out.println("Update Quantity:");
        inv.updateQuantityById(101, 100);
        inv.display();
        System.out.println("Sort by Name ASC:");
        inv.sortBy("name", true);
        inv.display();
        System.out.println("Sort by Price DESC:");
        inv.sortBy("price", false);
        inv.display();
        System.out.println("Remove Item ID 102:");
        inv.removeById(102);
        inv.display();
    }
}
