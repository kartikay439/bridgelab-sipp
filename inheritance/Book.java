package inheritance;

class Book {
    String title;
    int publicationYear;

    public Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    String authorName;
    String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.authorName = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName + "\nBio: " + bio);
    }
}
