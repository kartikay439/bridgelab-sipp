
import java.util.Scanner;

//Question 9
//CP - Write a program to check whether a number is positive, negative, or zero.
//        Hint =>
//        1. Get integer input from the user and store it in the number variable.
//2. If the number is positive, print positive.
//        3. If the number is negative, print negative.
//        4. If the number is zero, print zero.
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        int n = sc.nextInt();

        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }
        else {
            System.out.println(0);
        }
    }
}
