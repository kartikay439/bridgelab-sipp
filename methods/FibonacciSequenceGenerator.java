import java.util.Scanner;

public class FibonacciSequenceGenerator {
    static Scanner sc = new Scanner(System.in);

    static int input() {
        System.out.print("Enter number : ");
        return sc.nextInt();
    }

    static void generateFibonacciSequence(int n) {
        int count = 0;
        int a = 0;
        int b = 1;
        while (count < n) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
    }

    public static void main(String[] args) {
        int n = input();
        generateFibonacciSequence(n);
    }


}
