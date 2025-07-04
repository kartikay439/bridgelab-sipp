//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
//Hint =>
//Create a variable named fee and take user input for fee.
//Create another variable discountPercent and take user input.
//Compute the discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.
//I/P => fee, discountPrecent
//O/P => The discount amount is INR ___ and final discounted fee is INR ___

public class Question_9 {

    static double findDiscountedPrice(int discount, int amount) {
        return amount - amount * discount / 100f;
    }

    public static void main(String[] args) {
        System.out.print("Enter Fees : ");
        int fees = Question_8.sc.nextInt();
        System.out.print("Enter Discount : ");

        int discount = Question_8.sc.nextInt();
        System.out.println("Discounted fees :  " + findDiscountedPrice(discount, fees));
    }

}
