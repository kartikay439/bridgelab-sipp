public class StringComparator {
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        System.out.println(compareStrings("apple", "banana"));
    }
}