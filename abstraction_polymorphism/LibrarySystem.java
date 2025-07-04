package abstraction_polymorphism;
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class for all library items
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;
    private boolean isReserved;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }

    public abstract int getLoanDuration(); // in days

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author +
                (borrower != null ? ", Borrowed by: " + borrower : "") +
                (isReserved ? " [Reserved]" : "");
    }

    // Encapsulated borrower access
    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected String getBorrower() {
        return borrower;
    }

    protected boolean isReserved() {
        return isReserved;
    }

    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }
}

// Book class
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) return false;
        setReserved(true);
        setBorrower(borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) return false;
        setReserved(true);
        setBorrower(borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) return false;
        setReserved(true);
        setBorrower(borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main system
public class LibrarySystem {

    public static void runLibrarySystem() {
        LibraryItem[] items = {
            new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Magazine("M001", "National Geographic", "Various"),
            new DVD("D001", "Interstellar", "Christopher Nolan")
        };

        // Borrower attempts
        String borrower = "John Doe";

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                if (reservable.reserveItem(borrower)) {
                    System.out.println("Item reserved for: " + borrower);
                } else {
                    System.out.println("Item not available for reservation.");
                }
            }

            System.out.println("Updated Details: " + item.getItemDetails());
        }
    }

    public static void main(String[] args) {
        runLibrarySystem();
    }
}
