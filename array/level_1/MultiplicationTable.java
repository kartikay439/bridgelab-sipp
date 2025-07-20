package level_1;


import java.util.Scanner;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n + "*" + i + "=" + (n*i));
    }
}

