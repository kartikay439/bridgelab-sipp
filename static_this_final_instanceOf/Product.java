package static_this_final_instanceOf;

class Product {
    //Initial Discount Independent of Product instance;
    private static double discount = 10.0;

    //Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    //Parameterized Constructor
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //Class method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    //displaying the data of current object
    public void displayProductDetails() {
        if (this instanceof Product)   {          
            System.out.println("Product ID   : " + productID);
            System.out.println("Name         : " + productName);
            System.out.println("Price        : ₹" + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");
        } else {
            System.out.println("Invalid product instance.");
        }
    }
    }

