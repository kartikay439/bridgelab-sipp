//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import level_1.Question_8;

public class Question_13 {
    public static void main(String[] args) {
        System.out.print("Enter distance in feet : ");
        double feetDistance = Question_8.sc.nextDouble();

        System.out.println("Distance in yards : "+feetDistance/3+" yards");
        System.out.println("Distance in miles : "+feetDistance/(3*1760)+" miles");


    }
}
