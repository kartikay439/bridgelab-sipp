package level_3;

public class FactorOperations {

    public static int[] getFactors(int n) {
        if (n <= 0) return new int[0];

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }

        return factors;
    }

    public static int greatestFactor(int n) {
        if (n <= 1) return -1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) return i;
        }
        return 1;
    }

    public static int sumOfFactors(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static long productOfFactors(int n) {
        int[] factors = getFactors(n);
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    public static double productOfCubedFactors(int n) {
        int[] factors = getFactors(n);
        double product = 1;
        for (int factor : factors) product *= Math.pow(factor, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nGreatest factor: " + greatestFactor(number));
        System.out.println("Sum of factors: " + sumOfFactors(number));
        System.out.println("Product of factors: " + productOfFactors(number));
        System.out.println("Product of cubed factors: " + productOfCubedFactors(number));
    }
}