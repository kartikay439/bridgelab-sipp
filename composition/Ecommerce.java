class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name; this.price = price;
    }
}

class Order {
    Customer customer;
    ArrayList<Product> products = new ArrayList<>();

    public Order(Customer c) {
        this.customer = c;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order for: " + customer.name);
        for (Product p : products)
            System.out.println("- " + p.name + " Rs." + p.price);
    }
}

class Customer {
    String name;
    public Customer(String name) {
        this.name = name;
    }

    public Order placeOrder() {
        return new Order(this);
    }
}
