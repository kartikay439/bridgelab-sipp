public class Question_14 {
    public static void main(String[] args) {
        System.out.println("This is Question_14");
    }
}import java.util.Scanner;

public class Question_14 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);

        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (String[] wl : wordLengths) {
            System.out.printf("%-15s %-10d\n", wl[0], Integer.parseInt(wl[1]));
        }

        scanner.close();
    }
}