
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a natural number greater than zero.");
            return;
        }

        int[] odd = new int[n / 2 + 1];
        int[] even = new int[n / 2 + 1];
        int o = 0, e = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.print("Odd : { ");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i]);
            if (i < o - 1) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Even : { ");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i]);
            if (i < e - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}