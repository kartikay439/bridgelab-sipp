package constructor;
// Create a Book class with attributes 
// title, author, and price. Provide both default and parameterized constructors.

public class Book {
    String title ; 
    String author;
    Double price;

    public Book() {
        this.author = "book author";
        this. title = "book title";
        this.price = 0D;
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }  
    
}
