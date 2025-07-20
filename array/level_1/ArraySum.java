package level_1;

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        int i = 0;
        while(i < 10){
            double n = sc.nextDouble();
            if(n <= 0) break;
            a[i++] = n;
        }
        double sum = 0;
        for(int j=0;j<i;j++){
            System.out.println(a[j]);
            sum += a[j];
        }
        System.out.println("sum = " + sum);
    }
}
