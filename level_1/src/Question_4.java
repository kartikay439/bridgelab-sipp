//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
//Hint =>
//Use a single print statement to display multiline text and variables.
//        Profit = selling price - cost price
//Profit Percentage = profit / cost price * 100
//I/P => NONE
//O/P =>
//The Cost Price is INR ___ and Selling Price is INR ___
//The Profit is INR ___ and the Profit Percentage is ___

public class Question_4 {
    public static void main(String[] args) {
        int sellingPrice = 100;
        int costPrice = 90;

        double difference = Math.abs(sellingPrice-costPrice);

        if(sellingPrice < costPrice){
            System.out.println("Loss : "+difference+" Loss  Percentage "+difference/costPrice*100+" %");

        } else if (sellingPrice>costPrice) {
            System.out.println("Profit : "+difference+" Profit Percentage "+difference/costPrice*100+" %");
        }
        else {
            System.out.println("No Profit/Loss");
        }

    }
}
