package level_1;
import java.util.*;
public class Table6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[4];
        for(int i=6;i<=9;i++) a[i-6] = n*i;
        for(int i=6;i<=9;i++) System.out.println(n + "*" + i + "=" + a[i-6]);
    }
}
