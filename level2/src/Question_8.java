// 8-Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();

        // Double operations
        double result1 = a + b * c;     // b * c first, then add a
        double result2 = a * b + c;     // a * b first, then add c
        double result3 = c + a / b;     // a / b first, then add c
        double result4 = a % b + c;     // a % b first, then add c

        // Output
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}
