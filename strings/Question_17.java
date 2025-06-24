import java.util.Scanner;
import java.util.Random;

public class Question_17 {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Random 2-digit age (10-99)
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = ages[i] >= 18 && ages[i] >= 0 ? "true" : "false";
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s\n", "Age", "Can Vote");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students (default 10): ");
        int n = scanner.hasNextInt() ? scanner.nextInt() : 10;

        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);

        scanner.close();
    }
}