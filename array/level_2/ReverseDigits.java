package level_2;
import java.util.*;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0, temp = n;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] d = new int[count];
        for (int i = 0; i < count; i++) {
            d[i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < count; i++)
            System.out.print(d[i] + " ");
    }
}
