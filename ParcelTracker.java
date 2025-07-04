package workshop;

import java.util.ArrayList;

class Product{
    String name;
    static int id = 0;
    String productId;

    Product(String name){
        this.name = name;
        this.productId = "P"+id++;
    }

    Stage startStage;
    Stage lastStage;

    public void addStage(Status status){
        if(startStage == null){
            startStage = lastStage = new Stage(status);
            return;
        }
        Stage newStage = new Stage(status);
        lastStage.next = newStage;
        lastStage = newStage;
    }

    public void getCurrentStage(){
        if(lastStage == null){
            System.out.println("Not Ordered Yet");
        }
        System.out.println("Current Stage : "+lastStage.status);
    }

    public void getAllStages(){
        if(startStage==null){
            System.out.println("Product Not Ordered Yet");
            return;
        }

        System.out.println("Product Status ------------------------ ");
        Stage temp = startStage;
        while(temp != null){
            System.out.print(temp.status + " -> ");

            if(temp.status == Status.Delivered){
                System.out.println("Product Delivered");
            }
            temp = temp.next;
        }
        System.out.println();

    }

    public void getALlStages(){
        System.out.println("ID : "+productId);
        getAllStages();
        getCurrentStage();
    }

}

//Status Values
enum Status{
 Packed,Shipped,InTransit,Delivered
}

//Stage Node
class Stage{
    Status status;
    Stage next;

    public Stage(Status status){
        this.status = status;
    }

}



public class ParcelTracker {
    ArrayList<Product> products = new ArrayList<>();
    public  void addNewProduct(Product product){
        products.add(product);
    }
    public Product searchProductByID(String id){
        for (Product p : products) {
            if(p.productId == id){
                return  p;
            }
        }
        return  null;
    }


    public static void main(String[] args) {

        ParcelTracker parcelTracker = new ParcelTracker();





    Product p= new Product("Samsung A9");
    p.addStage(Status.Packed);
    p.addStage(Status.Shipped);
    p.addStage(Status.InTransit);

    System.out.println("Product ID : "+p.productId);

    parcelTracker.addNewProduct(p);


    
    p.getAllStages();
    p.getCurrentStage();
         
    }

}
