package level_1;

// Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and
// price. Add a method to display all the details of the phone. The MobilePhone class uses
// attributes to store the phone&#39;s characteristics. The method is used to retrieve and
// display this information for each object.

public class MobilePhone {
    String brand ; 
    String model;
    Double price;

    public MobilePhone(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }



      void ShowItemDetail(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
     }
    
}
