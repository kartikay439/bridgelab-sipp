package level_1;
import java.util.Scanner;

public class MinMax {
    public static void findMinMax(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findMinMax(a, b, c);
    }
}
