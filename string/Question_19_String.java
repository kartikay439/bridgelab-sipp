import java.util.Scanner;

public class Question_19_String {
    public static int[] trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        int[] bounds = trimSpaces(text);
        String customTrim = createSubstring(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();
        boolean areEqual = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom trim: '" + customTrim + "'");
        System.out.println("Built-in trim: '" + builtInTrim + "'");
        System.out.println("Results match: " + areEqual);

        scanner.close();
    }
}