//Question 3
//CP - Create a program to print a multiplication table of a number.
//        Hint =>
//        1. Get an integer input and store it in the number variable. Also, define an integer array to store the results
//of multiplication from 1 to 10
//        2. Run a loop from 1 to 10 and store the results in the multiplication table array
//3. Finally, display the result from the array in the format number * i = ___


import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        int[] table = new int[10];

        for (int i = 1; i <= 10 ; i++) {
            table[i-1] = number*i;
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(number+" x "+i+1+" = "+table[i]);
        }


    }
}
