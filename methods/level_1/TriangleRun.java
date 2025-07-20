package level_1;
import java.util.Scanner;
public class TriangleRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangle (in meters): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int perimeter = a + b + c;
        int rounds = 5000 / perimeter;
        System.out.println("The athlete has to complete " + rounds + " rounds.");
    }
}
