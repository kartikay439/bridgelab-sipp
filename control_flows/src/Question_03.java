import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int fact = 1, i = 1;
        while (i <= num) {
            fact *= i++;
        }
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
