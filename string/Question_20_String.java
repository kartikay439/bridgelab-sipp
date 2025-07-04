import java.util.Scanner;

public class Question_20_String {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32); // Convert to lowercase
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        if (c >= 'a' && c <= 'z') return "Consonant";
        return "Not a Letter";
    }

    public static String[][] findVowelsConsonants(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkChar(c);
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s\n", "Character", "Type");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[][] results = findVowelsConsonants(text);
        displayResults(results);

        scanner.close();
    }
}