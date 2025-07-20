public class CharRemover {
    public static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        System.out.println(removeChar("Hello World", 'l'));
    }
}