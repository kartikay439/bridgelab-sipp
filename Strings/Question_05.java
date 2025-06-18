import java.util.Scanner;

public class Question_5 {
    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customChars = getCharacters(text);
        char[] builtInChars = text.toCharArray();
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        System.out.print("Custom characters: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.print("\nBuilt-in characters: ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println("\nResults match: " + areEqual);

        scanner.close();
    }
}