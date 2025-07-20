package level_3;

public class NumberChecker2 {
    public static int countDigits(int n) {
        return n == 0 ? 1 : (int)Math.log10(Math.abs(n)) + 1;
    }

    public static int[] getDigits(int n) {
        int[] digits = new int[countDigits(n)];
        for (int i = digits.length - 1, num = Math.abs(n); i >= 0; i--, num /= 10)
            digits[i] = num % 10;
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            reversed[i] = digits[digits.length - 1 - i];
        return reversed;
    }

    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        return areEqual(digits, reverseDigits(digits));
    }

    public static boolean isDuck(int n) {
        int[] digits = getDigits(n);
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Duck: " + isDuck(num));
    }
}