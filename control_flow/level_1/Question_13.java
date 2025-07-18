import java.util.Scanner;

public class Question_13 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a natural number: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("The number " + n + " is not a natural number.");
	        } else {
	            // Using formula
	            int formulaSum = n * (n + 1) / 2;

	            // Using for loop
	            int loopSum = 0;
	            for (int i = 1; i <= n; i++) {
	                loopSum += i;
	            }

	            // Output both results
	            System.out.println("Sum using for loop: " + loopSum);
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
