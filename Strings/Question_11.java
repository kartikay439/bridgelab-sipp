import java.util.Scanner;

public class Question_11 {
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words[wordIndex++] = word.toString();
                    word = new StringBuilder();
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) words[wordIndex] = word.toString();
        return words;
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestLen = Integer.MAX_VALUE, longestLen = Integer.MIN_VALUE;
        int shortestIdx = 0, longestIdx = 0;
        for (int i = 0; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < shortestLen) {
                shortestLen = len;
                shortestIdx = i;
            }
            if (len > longestLen) {
                longestLen = len;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);
        int[] indices = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[indices[0]][0] + " (Length: " + wordLengths[indices[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[indices[1]][0] + " (Length: " + wordLengths[indices[1]][1] + ")");

        scanner.close();
    }
}