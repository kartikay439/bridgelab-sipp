import java.util.Scanner;

public class Question_9_String {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.next();
        System.out.print("Enter second string: ");
        String s2 = scanner.next();

        boolean customEqual = compareStrings(s1, s2);
        boolean builtInEqual = s1.equals(s2);

        System.out.println("Custom comparison: " + customEqual);
        System.out.println("Built-in comparison: " + builtInEqual);
        System.out.println("Results match: " + (customEqual == builtInEqual));

        scanner.close();
    }
}