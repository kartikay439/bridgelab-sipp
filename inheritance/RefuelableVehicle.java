package inheritance;

public class RefuelableVehicle {
    
}
interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int speed) {
        super(model, speed);
    }

    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int speed) {
        super(model, speed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}
