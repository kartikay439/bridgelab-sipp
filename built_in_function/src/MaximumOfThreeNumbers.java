import java.util.Scanner;

public class MaximumOfThreeNumbers {
    static Scanner sc = new Scanner(System.in);

    static int input() {
        System.out.println("Enter number : ");
        return sc.nextInt();
    }

    static void greatestOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Number 1 is gratest");
        } else {
            if (b > c) {
                System.out.println("Number 2 is gratest");
            } else {
                System.out.println("Number 3 is gratest");
            }
        }
    }

    public static void main(String[] args) {
        int a = input();
        int b = input();
        int c = input();
        greatestOfThree(a, b, c);
    }
}
