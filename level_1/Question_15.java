//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___


import level_1.Question_8;

public class Question_15 {
    public static void main(String[] args) {
        System.out.println("Enter unit price : ");
        double unitPrice = Question_8.sc.nextDouble();
        System.out.println("Enter unit quantity : ");
        double quantity = Question_8.sc.nextDouble();

        System.out.print("The total purchase price is INR " + unitPrice * quantity + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}
