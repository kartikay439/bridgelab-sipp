import java.util.Random;

public class Question_18 {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // Random 2-digit score
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][2];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            String grade, remark;
            if (percent >= 80) { grade = "A"; remark = "Level 4"; }
            else if (percent >= 70) { grade = "B"; remark = "Level 3"; }
            else if (percent >= 60) { grade = "C"; remark = "Level 2"; }
            else if (percent >= 50) { grade = "D"; remark = "Level 1"; }
            else if (percent >= 40) { grade = "E"; remark = "Level 1-"; }
            else { grade = "R"; remark = "Remedial"; }
            grades[i][0] = grade;
            grades[i][1] = remark;
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i][0]);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Default 10 students
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}