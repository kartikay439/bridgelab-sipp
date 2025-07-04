import java.util.Scanner;

public class GCD_LCM_Calculator {
    static Scanner sc = new Scanner(System.in);

    static int input() {
        System.out.print("Enter number : ");
        return sc.nextInt();
    }

    static int LCM(int m,int n) {
      return (m*n)/GCD(m,n);
    }

    static int GCD(int m,int n) {
        if(n == 0)return m;
        if(m>n){
            int temp = m;
            m = n;
            n = temp;
        }
        return GCD(m,n%m);
    }

    public static void main(String[] args) {
        int a = input();
        int b = input();
        System.out.println("LCM : "+LCM(a,b));
        System.out.println("GCD : "+GCD(a,b));
    }

}
