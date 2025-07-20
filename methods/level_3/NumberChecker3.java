package level_3;

public class NumberChecker3 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        for (int num = Math.abs(n); num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        long square = (long)n * n;
        while (n > 0) {
            if (n % 10 != square % 10) return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        System.out.println("Prime: " + isPrime(17));
        System.out.println("Neon: " + isNeon(9));
        System.out.println("Spy: " + isSpy(123));
    }
}