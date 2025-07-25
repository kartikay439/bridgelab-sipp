package level_2;
import java.util.Scanner;
public class BMICalculator2 {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getBMIStatus(data[i][2]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] +
                    ", Height = " + data[i][1] +
                    ", BMI = " + data[i][2] +
                    ", Status = " + status[i]);
        }

        sc.close();
    }
}
