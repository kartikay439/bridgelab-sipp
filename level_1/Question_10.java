//Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//I/P => height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import level_1.Question_8;

public class Question_10 {
    public static void main(String[] args) {
        System.out.println("Enter your height int centimeter : ");
        double height = Question_8.sc.nextDouble();

        System.out.println("Height in inch : "+height/2.24+" inch");
        System.out.println("Height in foot : "+height/(2.24*12)+" foot");
    }
}
