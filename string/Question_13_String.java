import java.util.Scanner;

public class Question_13_String {
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        return rand == 0 ? "rock" : rand == 1 ? "paper" : "scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        double playerPercent = (double) playerWins / totalGames * 100;
        double computerPercent = (double) computerWins / totalGames * 100;
        return new String[][] {
            {"Player", String.valueOf(playerWins), String.format("%.2f%%", playerPercent)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)}
        };
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-10s %-10s\n", "Game", "Player", "Computer");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s\n", result[0], result[1], result[2]);
        }
        System.out.println("\nStatistics:");
        System.out.printf("%-10s %-10s %-10s\n", "Player", "Wins", "Percentage");
        for (String[] stat : stats) {
            System.out.printf("%-10s %-10s %-10s\n", stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        String[][] results = new String[games][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String player = scanner.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(player, computer);
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            results[i] = new String[]{String.valueOf(i + 1), player, computer + " (" + winner + ")"};
        }

        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(results, stats);

        scanner.close();
    }
}