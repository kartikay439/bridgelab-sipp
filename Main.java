import java.util.ArrayList;
import java.util.List;

class FlightBookingSystem {
    List<Flight> flights;
    List<Booking> bookings;
    List<Traveller> travellers;

    public FlightBookingSystem() {
        this.flights = new ArrayList<>();
        bookings = new ArrayList<>();
        travellers = new ArrayList<>();
    }   
    
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public  List<Flight> searchFlight(String boarding,String destination){
        List<Flight> availableFlights = new ArrayList<>();
        for(Flight i:flights){
            System.out.println("searching..");
            if(i.boarding == boarding && i.destination==destination){
                availableFlights.add(i);
            }
        }
        return availableFlights;
    }

    public void addTraveller(Traveller traveller){
        travellers.add(traveller);
    }

    public Traveller searcTraveller(String userId){
        for (Traveller i:travellers) {
            if(i.userId == userId)return i;
        }
        return null;
    }
    public Flight searcFlight(String fligthId){
        for (Flight i:flights) {
            if(i.flightId == fligthId)return i;
        }
        return null;
    }

    public void bookFlight(String flightId,String userId){
        Booking booking = new Booking(userId, flightId);
        bookings.add(booking);
    }

    public void showAllBookings(){
        for (Booking booking : bookings) {
            Traveller traveller = searcTraveller(booking.userId);
            System.out.println("Name : "+traveller.name);
            Flight f = searcFlight(booking.flightId);
            System.out.println("Flight Name : "+f.company);
            System.out.println("Boarding : "+f.boarding);
            System.out.println("Destination : "+f.destination);
        }
    }



    
    
}



class Flight{
    static int id = 0;
    public Flight(String company, String boarding, String destination,int capacity,double fare) {
        this.flightId = "f"+id++;
        this.company = company;
        this.boarding = boarding.trim().toLowerCase();
        this.destination = destination.trim().toLowerCase();
        this.capacity = capacity;
        this.fare = fare;
    }
    String flightId;
    String company;
    String boarding;
    String destination; 
    int capacity;
    double fare;
}

class Booking {
    String userId;
    String flightId;
    public Booking(String userId, String flightId) {
        this.userId = userId;
        this.flightId = flightId;
    }
       
}
 class Traveller {
    static int id = 0;
    String userId;
    String name;
    int age;
    String mobileNumber;

    public Traveller(String name, int age, String mobileNumber) {
        this.userId = "u"+id++;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }
        
}

public class Main{

    public static void main(String[] args) {
         FlightBookingSystem flightBookingSystem = new FlightBookingSystem();
 Flight f1 =new Flight("air india","kanpur","bengaluru",150,4500.0);
 Flight f2 =new Flight("air india","kolkata","chennai",150,4500.0);
 Flight f3 =new Flight("air india","delhi","bengaluru",150,4500.0);
 Flight f4 =new Flight("air india","kanpur","delhi",150,4500.0);
 flightBookingSystem.addFlight(f1);
 flightBookingSystem.addFlight(f2);
 flightBookingSystem.addFlight(f3);
 flightBookingSystem.addFlight(f4);


 Traveller t1 = new Traveller("kartikay",22,"9336975213");
List<Flight> searchFLights = flightBookingSystem.searchFlight("kolkata","chennai");
 if(searchFLights.isEmpty()){
    System.out.println("No flights found");
 }else
 for (Flight flight : searchFLights) {
    System.out.println("Flight Name : "+flight.company);

    System.out.println("Boarding : "+flight.boarding);
    System.out.println("Destination : "+flight.destination);

    System.out.println("Flight Fare : "+flight.fare);
    System.out.println("Flight ID : "+flight.flightId);



 }
    }




    
}
