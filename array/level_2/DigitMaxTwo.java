package level_2;

import java.util.*;
public class DigitMaxTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxDigit = 10;
        int[] d = new int[maxDigit];
        int i = 0;

        while(n > 0 && i < maxDigit) {
            d[i++] = n % 10;
            n /= 10;
        }

        int first = -1, second = -1;
        for(int j = 0; j < i; j++) {
            if(d[j] > first) {
                second = first;
                first = d[j];
            } else if(d[j] > second && d[j] != first)
                second = d[j];
        }

        System.out.println("Largest = " + first);
        System.out.println("Second Largest = " + second);
    }
}
