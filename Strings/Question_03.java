/* Question 3
CP - Write a program to convert the complete text to lowercase and compare the results
Hint =>
1. Take user input using the Scanner nextLine() method to take the complete text into a String variable
2. Write a method using the String built-in charAt() method to convert each character to lowercase if it is uppercase. Use the logic ASCII value of 'a' is 97 and
'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
3. Write a method to compare two strings using the charAt() method and return a boolean result
4. In the main(), use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And
finally, display the result
 */
 
 import java.util.Scanner;

public class Question_3 {
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
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

        String customLower = toLowerCaseCustom(text);
        String builtInLower = text.toLowerCase();

        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Results match: " + areEqual);

        scanner.close();
    }
}