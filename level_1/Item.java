package level_1;

// 3. Program to Track Inventory of Items
// Problem Statement: Create an Item class with attributes itemCode, itemName, and
// price. Add a method to display item details and calculate the total cost for a given
// quantity.

public class Item{
    static int universalId = 10000;

    int itemCode;
    String itemName;
    double price;
    
    public Item(int itemCode,String itemName,double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    

    double getTotalCost(int quantity){
       return ((double) quantity)*price;
    }

    void ShowItemDetail(){
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Code: "+itemCode);
        System.out.println("Price : "+price);
     }

}

