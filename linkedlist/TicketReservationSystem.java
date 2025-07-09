class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketSystem {
    Ticket head = null;
    Ticket tail = null;

    void addAtEnd(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket t = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = t;
            t.next = head;
        } else {
            tail.next = t;
            tail = t;
            tail.next = head;
        }
    }

    void removeById(int ticketId) {
        if (head == null) return;
        if (head == tail && head.ticketId == ticketId) {
            head = tail = null;
            return;
        }
        Ticket cur = head, prev = tail;
        do {
            if (cur.ticketId == ticketId) {
                if (cur == head) {
                    head = head.next;
                    tail.next = head;
                } else if (cur == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != head);
    }

    void displayAllTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomer(String customerName) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void searchByMovie(String movieName) {
        if (head == null) return;
        Ticket temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            }
            temp = temp.next;
        } while (temp != head);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
class Main {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addAtEnd(101, "Alice", "Oppenheimer", "A1", "10:00 AM");
        system.addAtEnd(102, "Bob", "Inception", "B2", "11:00 AM");
        system.addAtEnd(103, "Charlie", "Oppenheimer", "C3", "12:00 PM");
        system.displayAllTickets();
        System.out.println("Search by Customer:");
        system.searchByCustomer("Alice");
        System.out.println("Search by Movie:");
        system.searchByMovie("Oppenheimer");
        System.out.println("Total Tickets: " + system.countTickets());
        System.out.println("Removing Ticket ID 102:");
        system.removeById(102);
        system.displayAllTickets();
        System.out.println("Total Tickets: " + system.countTickets());
    }
}
