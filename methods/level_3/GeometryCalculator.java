package level_3;

import java.util.Scanner;

public class GeometryCalculator {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineEquation = getLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean distance: %.2f\n", distance);
        System.out.printf("Line equation: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }
}