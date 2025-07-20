//Write a program to create a basic calculator that can perform
// addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations

//Hint =>
//Create a variable number1 and number 2 and take user inputs.
//Perform Arithmetic Operations of addition, subtraction, multiplication
// and division and assign the result to a var
// iable and finally print the result

import level_1.Question_8;

//I/P => number1, number2
//O/P => The addition, subtraction, multiplication and division
// value of 2 numbers ___ and ___ is ___, ____, ____, and ___
public class Question_11 {
    public static void main(String[] args) {
        System.out.print("Enter number 1 : ");
        int num1 = Question_8.sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = Question_8.sc.nextInt();

        System.out.println("Addition : " + num1+num2);
        System.out.println("Subtraction : " + (num1-num2));
        System.out.println("Multiplication : " + num1*num2);
        System.out.println("Division : " + num1/num2);
    }

}
