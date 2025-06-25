package static_this_final_instanceOf;

class Book {
    //library name will remain same across all the classes
    private static String libraryName = "City Central Library";
    private String title;
    private String author;

    //Once declare cant be changed
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title : " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN  : " + b.isbn);
        } else {
            System.out.println("Not a valid Book instance.");
        }
    }
}
