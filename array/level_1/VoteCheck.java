package level_1;//Question 1
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

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<10;i++) a[i]=sc.nextInt();
        for(int i : a){
            if(i<0) System.out.println("Invalid");
            else if(i>=18) System.out.println(i + " can vote");
            else System.out.println(i + " cannot vote");
        }
    }
}
