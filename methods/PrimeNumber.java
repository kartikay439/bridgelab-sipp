import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);

    static int input() {
        System.out.print("Enter number : ");
        return sc.nextInt();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = input();
        if (isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }


}
