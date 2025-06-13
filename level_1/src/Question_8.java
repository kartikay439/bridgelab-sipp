//Create a program to convert distance in kilometers to miles.
//Hint =>
//Create a variable km and assign type as double as in double km;
//Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
//Use Scanner Object to take user input for km as in km = input.nextInt();
//Use 1 mile = 1.6 km formulae to calculate miles and show the output
//I/P => km
//O/P => The total miles is ___ mile for the given ___ km

import java.util.Scanner;

public class Question_8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter distance in km : ");
        double kilometerDistance = sc.nextDouble();

        System.out.println("Distance in miles : "+kilometerDistance*1.6);

    }


}
