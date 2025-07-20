//Write a program to find the side of the square whose parameter you read from user
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

import level_1.Question_8;

public class Question_12 {
    public static void main(String[] args) {
        System.out.print("Enter Perimeter of the Square : ");
        double perimeter = Question_8.sc.nextDouble();
        System.out.println("The length of the side is : " + perimeter / 4 + " whose perimeter is : " + perimeter);


    }
}
