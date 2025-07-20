//Create a program to find the maximum number of handshakes among N number of students.
//        Hint =>
//Get integer input for numberOfStudents variable.
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Display the number of possible handshakes.

import level_1.Question_8;

public class Question_16{

    public static void main(String[] args) {
        System.out.print("Enter Number Of Students : ");
        int numberOfStudents = Question_8.sc.nextInt();
        int n = numberOfStudents;

        System.out.println("Maximum number of handshakes : "+ n*(n-1)/2);
    }

}
