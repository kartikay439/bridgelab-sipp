//Question 8
//CP - Write a program to find the sum of n natural numbers using for loop, compare the result with the
//formulae n*(n+1)/2 and show the result from both computations was correct.
//        Hint =>
//        1. Take the user input number and check whether it's a Natural number
//        2. If it's a natural number Compute using formulae as well as compute using for loop
//        3. Compare the two results and print the result

import java.util.Scanner;

public class Question_8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a natural number (n > 0): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive natural number.");
                return;
            }

            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two methods.");
            }
        }

}
