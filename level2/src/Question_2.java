//Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
//I/P => base, height
//O/P => The Area of the triangle in sq in is ___ and sq cm is ___


import java.util.Scanner;

public class Question_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter height : ");
        double height = sc.nextDouble();

        System.out.print("Enter base : ");
        double base = sc.nextDouble();

        System.out.println("Area of triangle is : "+.5*height*base);
    }
}
