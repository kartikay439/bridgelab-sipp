public class Question_7 {
    public static void generateException() {
        String text = null;
        text.length(); // NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating exception without handling:");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling exception with try-catch:");
        handleException();
    }
}