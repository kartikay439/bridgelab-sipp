package abstraction_polymorphism.vehicle_rental_system;

public class Truck extends Vehicle implements Insurable {
    
    private int tyres;
    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    Insurance insurance;    

    public Truck(String vehicleNumber, VehicleType type, double rentalRate,int tyreCount) {
        super(vehicleNumber, type, rentalRate);
        insurance = null;
        this.tyres  = tyreCount;
    
    }

    public void addInsurance(Insurance i){
        this.insurance = i;
    }


    public void showDetail(){
        System.out.println("Vehicle type : "+super.getType());
        System.out.println("Vehicle Numbe : "+super.getVehicleNumber());
        System.out.println("Insurance");
        Insurance i = super.getInsurance();
        System.out.println("Company : "+i.getInsuranceCompany());

    }


    @Override
    public double calculateInsurance() {
       return insurance.getInsuranceCost();
    }

    @Override
    public Insurance getInsuranceDetail() {
        if(insurance == null){
            System.out.println("No insurance added");
            return null;
        }
        return insurance;
    }


    @Override
    double calculateRentalCost(int days) {
        return (super.getRentalRate())*days;
    }
    

    
}

class Main{
    public static void main(String[] args) {
        Truck t = new Truck("XYZ4456", VehicleType.HeavyVehicle, 50, 24);

    }
}
