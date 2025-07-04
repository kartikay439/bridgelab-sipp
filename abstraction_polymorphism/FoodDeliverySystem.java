package abstraction_polymorphism;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity;
    }

    // Getters and Setters (Encapsulation)
    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem with simple pricing
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charges
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}

// NonVegItem with additional non-veg charge
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 20.0; // per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items (₹20 extra per item)";
    }
}

// Main System
public class FoodDeliverySystem {

    public static void runFoodDeliverySystem() {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1),
            new VegItem("Veg Burger", 100, 3),
            new NonVegItem("Mutton Curry", 300, 2)
        };

        processOrder(order);
    }

    public static void processOrder(FoodItem[] orderItems) {
        double grandTotal = 0;
        System.out.println("🛒 Order Summary--\n");

        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable disc = (Discountable) item;
                discount = disc.applyDiscount();
                System.out.println(disc.getDiscountDetails());
            }

            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.printf("Total: ₹%.2f | Discount: ₹%.2f | Final: ₹%.2f\n", total, discount, finalPrice);
        }

        System.out.printf("Grand Total Payable: ₹%.2f\n", grandTotal);
    }

    public static void main(String[] args) {
        runFoodDeliverySystem();
    }
}
