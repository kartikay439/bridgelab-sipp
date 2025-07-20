package level_2;
import java.util.*;
public class DynamicDigitMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxDigit = 10, i = 0;
        int[] d = new int[maxDigit];

        while (n > 0) {
            if (i == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < i; j++) temp[j] = d[j];
                d = temp;
            }
            d[i++] = n % 10;
            n /= 10;
        }

        int first = -1, second = -1;
        for (int j = 0; j < i; j++) {
            if (d[j] > first) {
                second = first;
                first = d[j];
            } else if (d[j] > second && d[j] != first) {
                second = d[j];
            }
        }

        System.out.println("Largest = " + first);
        System.out.println("Second Largest = " + second);
    }
}
