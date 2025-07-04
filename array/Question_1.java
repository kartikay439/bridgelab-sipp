//Question 1
//        CP - Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0
//        or a negative number. Show all the numbers as well as the sum of all numbers
//        Hint =>
//        1. Create a variable to store an array of 10 elements of type double and a variable to store the total of
//        type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
//        2. Use infinite while loop as in while (true)
//        3. Take the user entry and check if the user entered 0 or a negative number to break the loop
//        4. Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
//        5. If the user entered a number other than 0 or a negative number inside the while loop then assign the
//        number to the array element and increment the index value
//        6. Take another for loop to get the values of each element and add it to the total
//        7. Finally display the total value

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double num = 1.0;
        int pointer = 0;
        double[] arr = new double[10];

        while (num>0 && pointer<=9){
            System.out.print("Enter number : ");
            arr[pointer++] = sc.nextDouble();
        }

        double total = 0.0;
        System.out.print("{ ");
        for (double i : arr) {
            System.out.print(i+", ");
            total += i;
        }
        System.out.println("}");

        System.out.println("total : "+total);


    }
}