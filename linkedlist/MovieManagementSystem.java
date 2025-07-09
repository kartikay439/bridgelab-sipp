class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    Movie head, tail;

    void addAtBeginning(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (head == null) head = tail = m;
        else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    void addAtEnd(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (tail == null) head = tail = m;
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void addAtPosition(String title, String director, int year, double rating, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie m = new Movie(title, director, year, rating);
        Movie cur = head;
        for (int i = 0; i < pos - 1 && cur.next != null; i++) cur = cur.next;
        m.next = cur.next;
        m.prev = cur;
        if (cur.next != null) cur.next.prev = m;
        cur.next = m;
        if (m.next == null) tail = m;
    }

    void removeByTitle(String title) {
        Movie cur = head;
        while (cur != null) {
            if (cur.title.equalsIgnoreCase(title)) {
                if (cur == head) head = cur.next;
                if (cur == tail) tail = cur.prev;
                if (cur.prev != null) cur.prev.next = cur.next;
                if (cur.next != null) cur.next.prev = cur.prev;
                break;
            }
            cur = cur.next;
        }
    }

    void searchByDirector(String director) {
        Movie cur = head;
        while (cur != null) {
            if (cur.director.equalsIgnoreCase(director))
                System.out.println(cur.title + " " + cur.director + " " + cur.year + " " + cur.rating);
            cur = cur.next;
        }
    }

    void searchByRating(double rating) {
        Movie cur = head;
        while (cur != null) {
            if (cur.rating == rating)
                System.out.println(cur.title + " " + cur.director + " " + cur.year + " " + cur.rating);
            cur = cur.next;
        }
    }

    void updateRatingByTitle(String title, double rating) {
        Movie cur = head;
        while (cur != null) {
            if (cur.title.equalsIgnoreCase(title)) {
                cur.rating = rating;
                break;
            }
            cur = cur.next;
        }
    }

    void displayForward() {
        Movie cur = head;
        while (cur != null) {
            System.out.println(cur.title + " " + cur.director + " " + cur.year + " " + cur.rating);
            cur = cur.next;
        }
    }

    void displayReverse() {
        Movie cur = tail;
        while (cur != null) {
            System.out.println(cur.title + " " + cur.director + " " + cur.year + " " + cur.rating);
            cur = cur.prev;
        }
    }
}

class Main {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        list.addAtEnd("Matrix", "Wachowski", 1999, 8.7);
        list.addAtPosition("Prestige", "Nolan", 2006, 8.5, 2);
        list.displayForward();
        list.displayReverse();
        list.searchByDirector("Nolan");
        list.searchByRating(8.7);
        list.updateRatingByTitle("Matrix", 9.0);
        list.displayForward();
        list.removeByTitle("Interstellar");
        list.displayForward();
    }
}
