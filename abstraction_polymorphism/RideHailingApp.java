package abstraction_polymorphism;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Abstract method for fare
    public abstract double calculateFare(double distance);

    // Concrete method for details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName +
               ", Rate/KM: ₹" + ratePerKm + ", Location: " + currentLocation;
    }

    // Encapsulated fields
    protected double getRatePerKm() {
        return ratePerKm;
    }

    protected void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    protected String getDriverName() {
        return driverName;
    }

    protected void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    protected String getVehicleId() {
        return vehicleId;
    }

    protected void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    protected String getCurrentLocationInternal() {
        return currentLocation;
    }

    protected void setCurrentLocationInternal(String location) {
        this.currentLocation = location;
    }
}

// Car implementation
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // Base fare ₹50
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationInternal(newLocation);
    }
}

// Bike implementation
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No base fare
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationInternal(newLocation);
    }
}

// Auto implementation
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // Base fare ₹20
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocationInternal(newLocation);
    }
}

// Main App
public class RideHailingApp {

    public static void runRideSystem() {
        Vehicle[] fleet = {
            new Car("C101", "Alice", 15.0, "MG Road"),
            new Bike("B202", "Bob", 5.0, "Indira Nagar"),
            new Auto("A303", "Charlie", 10.0, "Electronic City")
        };

        double rideDistance = 12.5; // km

        System.out.println("🚕 Ride Fare Estimation\n---------------------------");

        for (Vehicle v : fleet) {
            System.out.println(v.getVehicleDetails());
            double fare = v.calculateFare(rideDistance);
            System.out.printf("Estimated Fare for %.1f km: ₹%.2f\n", rideDistance, fare);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        runRideSystem();
    }
}
