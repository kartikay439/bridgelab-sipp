package level_2;
import java.util.Scanner;
public class LengthConverter {

    public static double yardsToFeet(double y) { return y * 3; }
    public static double feetToYards(double f) { return f * 0.3333333; }
    public static double metersToInches(double m) { return m * 39.3701; }
    public static double inchesToMeters(double i) { return i * 0.0254; }
    public static double inchesToCm(double i) { return i * 2.54; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        double f = sc.nextDouble();
        double m = sc.nextDouble();
        double i = sc.nextDouble();
        double ic = sc.nextDouble();

        System.out.println(yardsToFeet(y));
        System.out.println(feetToYards(f));
        System.out.println(metersToInches(m));
        System.out.println(inchesToMeters(i));
        System.out.println(inchesToCm(ic));
        sc.close();
    }
}
