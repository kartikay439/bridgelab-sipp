package level_2;
import java.util.Scanner;
public class UnitConverter2 {

    public static double fahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double celsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public static double poundsToKg(double p) { return p * 0.453592; }
    public static double kgToPounds(double k) { return k * 2.20462; }
    public static double gallonsToLiters(double g) { return g * 3.78541; }
    public static double litersToGallons(double l) { return l * 0.264172; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahr = sc.nextDouble();
        double cel = sc.nextDouble();
        double lb = sc.nextDouble();
        double kg = sc.nextDouble();
        double gal = sc.nextDouble();
        double lit = sc.nextDouble();

        System.out.println(fahrenheitToCelsius(fahr));
        System.out.println(celsiusToFahrenheit(cel));
        System.out.println(poundsToKg(lb));
        System.out.println(kgToPounds(kg));
        System.out.println(gallonsToLiters(gal));
        System.out.println(litersToGallons(lit));
        sc.close();
    }
}
