package static_this_final_instanceOf;

class Vehicle {
    private static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name        : " + ownerName);
            System.out.println("Vehicle Type      : " + vehicleType);
            System.out.println("Registration No.  : " + registrationNumber);
            System.out.println("Registration Fee  : ₹" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle instance.");
        }
    }
}
