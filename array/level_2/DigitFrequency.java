package level_2;
import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[20];
        int[] freq = new int[10];
        int i = 0;

        while (n > 0) {
            digits[i++] = n % 10;
            n /= 10;
        }

        for (int j = 0; j < i; j++)
            freq[digits[j]]++;

        for (int d = 0; d < 10; d++)
            if (freq[d] > 0)
                System.out.println(d + " => " + freq[d]);
    }
}
