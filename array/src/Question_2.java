//Question 2
//CP - Write a program to check if the first, second, or third number is the largest of the three.
//I/P => number1, number2, number3
//O/P =>
//Is the first number the largest? ____
//Is the second number the largest? ___
//Is the third number the largest? ___

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();
        int a;
        int b;
        int c;
        if (num1 > num2 && num1 > num3) {
            a = num3;
            if (num2 > num3) {
                b = num2;
                c = num3;
            }else {
                b=num3;c=num2;
            }

        } else if (num1 > num2) {
            a = num3;
            b = num1;
            c = num2;
        } else if (num1 > num3) {
            a = num2;
            b = num1;
            c = num3;
        } else {
            c = num1;
            if (num2 > num3) {
                a = num2;
                b = num3;
            }else {
                a=num3;b=num2;
            }
        }
        System.out.println(a+" > "+b+" > "+c);
    }
}