package level_2;
import java.util.*;
public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble(), h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            double bmi = personData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
            System.out.println("W: " + personData[i][0] + " H: " + personData[i][1] +
                    " BMI: " + personData[i][2] + " Status: " + status[i]);
    }
}
