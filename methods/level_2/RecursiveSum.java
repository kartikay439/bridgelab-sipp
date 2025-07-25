package level_2;
import java.util.Scanner;

public class RecursiveSum {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recSum = recursiveSum(n);
        int formSum = formulaSum(n);
        System.out.println("Recursive Sum: " + recSum);
        System.out.println("Formula Sum: " + formSum);
        System.out.println("Are they equal? " + (recSum == formSum));
    }
}
