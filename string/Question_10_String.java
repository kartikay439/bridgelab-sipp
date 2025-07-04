import java.util.Scanner;

public class Question_10_String {
    public static void generateException(String text) {
        Integer.parseInt(text); 
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Generating exception without handling:");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling exception with try-catch:");
        handleException(text);

        scanner.close();
    }
}