//Question 7
//CP - Write a program to check if the first is the smallest of the 3 numbers.
//        I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("first number is smallest");
        } else {
            System.out.println("first number is not smallest of all");
        }
    }
}
