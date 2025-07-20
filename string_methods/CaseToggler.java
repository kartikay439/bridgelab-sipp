public class CaseToggler {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello World"));
    }
}