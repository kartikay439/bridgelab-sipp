package abstraction_polymorphism.vehicle_rental_system;

public class Car extends Vehicle implements Insurable {
      public Car(String vehicleNumber,double rentalRate) {
        super(vehicleNumber,VehicleType.MediumVehicle, rentalRate);
       
    }

 

  
    

    public void addInsurance(Insurance i){
        super.setInsurance(i);
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
       return super.getInsurance().getInsuranceCost();
    }

    @Override
    public Insurance getInsuranceDetail() {
        if(super.getInsurance() == null){
            System.out.println("No insurance added");
            return null;
        }
        return super.getInsurance();
    }


    @Override
    double calculateRentalCost(int days) {
        return (super.getRentalRate())*days;
    }
}
