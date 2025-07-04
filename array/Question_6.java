//Question 6
//CP - Write a program to count down the number from the user input value to 1 using a while loop for a rocket
//launch
//Hint =>
//        1. Create a variable counter to take user inputted value for the countdown.
//        2. Use the while loop to check if the counter is 1
//        3. Inside a while loop, print the value of the counter and decrement the counter

import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number");
			int number = sc.nextInt();

			while (number >0){
			    System.out.println("Counter : "+number--);
			}
		}
    }
}
