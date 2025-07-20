package level_2;
import java.util.Scanner;
public class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result > 0) System.out.println("First is greater");
        else if (result < 0) System.out.println("Last is greater");
        else System.out.println("Equal");

        sc.close();
    }
}
