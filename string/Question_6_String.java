import java.util.Scanner;

public class Question_6_String {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Access beyond array length
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }

        System.out.println("Generating exception without handling:");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling exception with try-catch:");
        handleException(names);

        scanner.close();
    }
}