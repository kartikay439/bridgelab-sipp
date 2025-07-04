import java.util.Scanner;

public class Question_4_String {
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
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start and end index: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        try {
            String customSub = createSubstring(text, start, end);
            String builtInSub = text.substring(start, end);
            boolean areEqual = compareStrings(customSub, builtInSub);
            System.out.println("Custom substring: " + customSub);
            System.out.println("Built-in substring: " + builtInSub);
            System.out.println("Results match: " + areEqual);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}