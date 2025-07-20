package level_3;

public class NumberChecker {
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int num = Math.abs(number);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int num = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        if (digits[0] == 0) return false;
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestTwoDigits(int number) {
        int[] digits = getDigitsArray(number);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestTwoDigits(int number) {
        int[] digits = getDigitsArray(number);
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num));
        System.out.println("Is duck number? " + isDuckNumber(num));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(num));
        int[] largestTwo = findLargestTwoDigits(num);
        System.out.println("Largest two digits: " + largestTwo[0] + ", " + largestTwo[1]);
        int[] smallestTwo = findSmallestTwoDigits(num);
        System.out.println("Smallest two digits: " + smallestTwo[0] + ", " + smallestTwo[1]);
    }
}