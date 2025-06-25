package constructor;

public class Product {
    String productName;
    double price;
    
    static int totalProduct=0;

    

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProduct++;
    }



    @Override
    public String toString() {
        return "Product [productName=" + productName + ", price=" + price + "]";
    }

    int displayTotalProducts(){
        return totalProduct;
    }


    
    
    
}
