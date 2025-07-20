public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        System.out.println(replaceWord("Hello world", "world", "Java"));
    }
}