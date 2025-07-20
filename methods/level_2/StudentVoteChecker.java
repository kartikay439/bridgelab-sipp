package level_2;
import java.util.Scanner;

class UnitConverterStatic {
    static double yardsToFeet(double y) { return y * 3; }
    static double feetToYards(double f) { return f * 0.3333333; }
    static double metersToInches(double m) { return m * 39.3701; }
    static double inchesToMeters(double i) { return i * 0.0254; }
    static double inchesToCm(double i) { return i * 2.54; }
    static double fToC(double f) { return (f - 32) * 5 / 9; }
    static double cToF(double c) { return (c * 9 / 5) + 32; }
    static double poundsToKg(double p) { return p * 0.453592; }
    static double kgToPounds(double k) { return k * 2.20462; }
    static double gallonsToLiters(double g) { return g * 3.78541; }
    static double litersToGallons(double l) { return l * 0.264172; }
}

public class StudentVoteChecker {
    void canStudentVote(int age) {
        if (age < 0) System.out.println("Invalid");
        else if (age >= 18) System.out.println("Yes");
        else System.out.println("No");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            checker.canStudentVote(age);
        }
        sc.close();
    }
}
