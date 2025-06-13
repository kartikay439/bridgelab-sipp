//Question 5
//CP - Write a program SpringSeason that takes two int values month and day from the command line and
//prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint =>
//        1. Spring Season is from March 20 to June 2

import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month : ");
        int month = sc.nextInt();

        System.out.print("Enter day : ");
        int day = sc.nextInt();

        switch (month) {
            case 3:
                if (day >= 20 && day <= 31) {
                    System.out.println("Its a Spring Season");
                    return;
                }
                case 4:
                if (day >= 1 && day <= 30) {
                    System.out.println("Its a Spring Season");
                    return;
                }
                case 5:
                if (day >= 1 && day <= 31) {
                    System.out.println("Its a Spring Season");
                    return;
                }
                case 6:
                if (day >= 1 && day <= 2) {
                    System.out.println("Its a Spring Season");
                    return;
                }
        }
        System.out.println("Not a Spring Season");

    }
}
