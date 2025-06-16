import java.util.Scanner;

//Question 10
//CP - Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%5 == 0){
            System.out.println("Number divisible by 5");
        }else{
            System.out.println("Number is not divisible by 5");
        }
    }
}
