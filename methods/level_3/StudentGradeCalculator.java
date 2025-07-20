package level_3;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static int[][] generateStudentMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90); // Physics (10-99)
            marks[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int)(Math.random() * 90); // Math
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = average;

            // Round to 2 decimal places
            total = (int) Math.round(total * 100) / 100;
            average = Math.round(average * 100) / 100.0;
            percentage = Math.round(percentage * 100) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%7d | %7d | %9d | %4d | %5d | %7.2f | %9.2f%% | %5s\n",
                    i+1, marks[i][0], marks[i][1], marks[i][2],
                    (int)results[i][0], results[i][1], results[i][2],
                    getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = generateStudentMarks(numStudents);
        double[][] results = calculateResults(marks);

        displayScorecard(marks, results);
    }
}