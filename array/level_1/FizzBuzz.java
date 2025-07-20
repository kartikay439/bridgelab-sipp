package level_1;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n+1];
        for(int i=0;i<=n;i++) {
            if(i%3==0 && i%5==0) a[i]="FizzBuzz";
            else if(i%3==0) a[i]="Fizz";
            else if(i%5==0) a[i]="Buzz";
            else a[i]=String.valueOf(i);
        }
        for(int i=0;i<=n;i++)
            System.out.println("Position " + i + " = " + a[i]);
    }
}
