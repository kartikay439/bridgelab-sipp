import java.util.Scanner;

public class Question_12 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a natural number: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("The number " + n + " is not a natural number.");
	        } else {
	            // Using formula
	            int formulaSum = n * (n + 1) / 2;

	            // Using while loop
	            int loopSum = 0;
	            int counter = 1;

	            while (counter <= n) {
	                loopSum += counter;
	                counter++;
	            }

	            // Output both results
	            System.out.println("Sum using while loop: " + loopSum);
	            System.out.println("Sum using formula: " + formulaSum);

	            // Compare and show result
	            if (loopSum == formulaSum) {
	                System.out.println("Both computations are correct and equal.");
	            } else {
	                System.out.println("The computations did not match.");
	            }
	        }

	        sc.close();
	    }
	}
