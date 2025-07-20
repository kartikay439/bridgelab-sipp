package level_1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++) a[i]=sc.nextInt();
        for(int i : a){
            if(i>0) System.out.println((i%2==0)?"even":"odd");
            else if(i<0) System.out.println("negative");
            else System.out.println("zero");
        }
        if(a[0]==a[4]) System.out.println("equal");
        else if(a[0]>a[4]) System.out.println("first greater");
        else System.out.println("last greater");
    }
}
