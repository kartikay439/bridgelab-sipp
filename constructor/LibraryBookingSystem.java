public class LibraryBookingSystem {
class Book{
    String title ; 
    String author;
    Double price;
    boolean availibility;

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

    public void borrow(){
        //logic
    }
    

}

}
