package level_2;
import java.util.*;
public class FactorCalculator {
    public static int[] findFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int num : arr) s += num;
        return s;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int num : arr) prod *= num;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sumSq = 0;
        for (int num : arr) sumSq += Math.pow(num, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
