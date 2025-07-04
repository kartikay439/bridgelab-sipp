package abstraction_polymorphism;

import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount(double discountPercentage);

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product implements Taxable {
    private int powerConsumption;

    public Electronics(String productId, String name, double price, int powerConsumption) {
        super(productId, name, price);
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount(double discountPercentage) {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}

class Clothing extends Product implements Taxable {
    private int size;

    public Clothing(String productId, String name, double price, int size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount(double discountPercentage) {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount(double discountPercentage) {
        return getPrice() * discountPercentage / 100;
    }
}

public class Ecommerce {

    public static void runEcommerce() {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics("E001", "Laptop", 50000, 150));
        cart.add(new Clothing("C001", "T-Shirt", 1000, 42));
        cart.add(new Groceries("G001", "Rice Bag", 1500));

        double discountPercentage = 10.0;
        printFinalPrices(cart, discountPercentage);
    }

    public static void printFinalPrices(List<Product> products, double discountPercentage) {
        for (Product product : products) {
            double discount = product.calculateDiscount(discountPercentage);
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: ₹" + product.getPrice());
            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        runEcommerce();
    }
}
