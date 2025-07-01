import java.lang.instrument.IllegalClassFormatException;
import java.util.ArrayList;
import java.util.List;

public class MovieScheduleManager {
    private List<Movie> movies;

    public MovieScheduleManager() {
        this.movies = new ArrayList<>() ;
    }
    
    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovieByIndex(int index) {
        if(index >= movies.size() || index < 0){
            throw new IndexOutOfBoundsException("Enter valid Index");
        }
        return movies.get(index);
    }

    public Movie searchMovie(String title){
        for (Movie movie : movies) {
            if(movie.title == title)
            return movie;
        }
        return null;
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void showAllMovies(){
        for (Movie movie : movies) {
            System.out.println("Title : "+movie.title);
            if(movie.showtimes.isEmpty()){
                System.out.println("No showtimes right now");
            }
            for (ShowTime showTime : movie.showtimes) {
                System.out.println("Start time :  "+showTime.startTime);
                System.out.println("End time :  "+showTime.endTime);

            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
    MovieScheduleManager movieScheduleManager  =new MovieScheduleManager();
    Movie m1 = new Movie("avengers");
    Movie m2 = new Movie("kalki");
    Movie m3 = new Movie("matrix");
    Movie m4 = new Movie("kalki");  
    
    m1.addShowTime("11:30", "13:30");
     m2.addShowTime("12:30", "14:30");
      m3.addShowTime("14:30", "16:30");
       m1.addShowTime("15:30", "17:30");

       movieScheduleManager.addMovie(m1);
       movieScheduleManager.addMovie(m2);
       movieScheduleManager.addMovie(m3);
       movieScheduleManager.addMovie(m4);

       movieScheduleManager.showAllMovies();

}

     
}

class Movie extends Throwable {
    boolean isCorrectTimeFormat(String time){
        if(time.length() != 5){
            return false;
        }
        if(time.charAt(2) != ':'){
return false;
        }

        String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);

       if(!Character.isDigit(hours.charAt(0))  || !Character.isDigit(hours.charAt(1)))return false;
       if(!Character.isDigit(minutes.charAt(0))  || !Character.isDigit(minutes.charAt(1)))return false;

       return true;


    }

    String title;  
    List<ShowTime> showtimes;
    public Movie(String title) {
        this.title = title;
        this.showtimes = new ArrayList<>();
    }


    
    public void addShowTime(String startTime,String endTime){
        ShowTime showTime = new ShowTime(startTime, endTime);
        if(!isCorrectTimeFormat(endTime) || !isCorrectTimeFormat(startTime)){
            throw new IllegalArgumentException("Invalid time");
        }
        showtimes.add(showTime);
    }
    
}

class ShowTime {
     static int id = 0;
    String startTime;
    String endTime;
    String showId;
    public ShowTime(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.showId = "booking"+id++;
    }    
}
 class User {
 static int id = 0;

 String userId;
 String name;
 String mobileNo;
 public User(String name, String mobileNo) {
    this.userId = "u"+id++;
    this.name = name;
    this.mobileNo = mobileNo;
 }


}



