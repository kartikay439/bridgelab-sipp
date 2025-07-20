package level_1;
import java.util.Scanner;
public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[] {
                Math.sin(rad), Math.cos(rad), Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + results[0]);
        System.out.println("Cos: " + results[1]);
        System.out.println("Tan: " + results[2]);
    }
}
