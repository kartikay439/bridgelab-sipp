package level_1;//Question 8
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), size = 10, count = 0;
        int[] a = new int[size];
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                if(count==size) {
                    size *= 2;
                    int[] temp = new int[size];
                    for(int j=0;j<count;j++) temp[j]=a[j];
                    a = temp;
                }
                a[count++] = i;
            }
        }
        for(int i=0;i<count;i++) System.out.print(a[i]+" ");
    }
}

