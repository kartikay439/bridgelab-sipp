//Question 5
//CP - Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display
//the result
//Hint =>
//        1. Take integer input and store it in the variable number, as well as define an integer array to store the
//multiplication result in the variable multiplicationResult
//2. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
//3. Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4]; // For multipliers 6, 7, 8, 9

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        System.out.println("\nMultiplication Table:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}