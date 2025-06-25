package constructor;
public class CarRental{

    static int costPerDay = 500;
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int totalCost(){
        return costPerDay*rentalDays;
    }    
}