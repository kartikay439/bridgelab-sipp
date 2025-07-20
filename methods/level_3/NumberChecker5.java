public class NumberChecker5 {
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) sum += i + (i == n/i ? 0 : n/i);
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) sum += i + (i == n/i ? 0 : n/i);
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) sum += i + (i == n/i ? 0 : n/i);
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int[] facts = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int sum = 0, num = n;
        while (num > 0) {
            sum += facts[num % 10];
            num /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Perfect: " + isPerfect(28));
        System.out.println("Strong: " + isStrong(145));
    }
}