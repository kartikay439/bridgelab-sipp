package level_3;

public class NumberCheckerExtended {
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

    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        if (number == 0) return false;
        return number % sumOfDigits(number) == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[] counts = new int[10];
        for (int digit : digits) {
            counts[digit]++;
        }

        int uniqueCount = 0;
        for (int count : counts) {
            if (count > 0) uniqueCount++;
        }

        int[][] frequency = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                frequency[index][0] = i;
                frequency[index][1] = counts[i];
                index++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int num = 21;
        System.out.println("Number: " + num);
        System.out.println("Digit count: " + countDigits(num));
        System.out.println("Sum of digits: " + sumOfDigits(num));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(num));
        System.out.println("Is Harshad number? " + isHarshadNumber(num));

        int[][] frequency = digitFrequency(11223344);
        System.out.println("Digit frequencies:");
        for (int[] entry : frequency) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}