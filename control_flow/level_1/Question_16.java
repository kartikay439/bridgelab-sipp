import java.util.Scanner;

public class Question_16 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a natural number: ");
	        int number = sc.nextInt();

	        if (number < 1) {
	            System.out.println("Please enter a valid natural number (greater than 0).");
	        } else {
	            for (int i = 1; i <= number; i++) {
	                if (i % 2 == 0) {
	                    System.out.println(i + " is an even number.");
	                } else {
	                    System.out.println(i + " is an odd number.");
	                }
	            }
	        }

	        sc.close();
	    }
	}
