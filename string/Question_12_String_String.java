import java.util.Scanner;

public class Question_12_String_String {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < getLength(text); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndices = new int[wordCount + 1];
        spaceIndices[0] = -1;
        int idx = 1;
        for (int i = 0; i < getLength(text); i++) {
            if (text.charAt(i) == ' ') spaceIndices[idx++] = i;
        }
        spaceIndices[idx] = getLength(text);

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndices[i] + 1; j < spaceIndices[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split("\\s+");
        boolean areEqual = compareArrays(customSplit, builtInSplit);

        System.out.print("Custom split: ");
        for (String word : customSplit) System.out.print(word + " ");
        System.out.print("\nBuilt-in split: ");
        for (String word : builtInSplit) System.out.print(word + " ");
        System.out.println("\nResults match: " + areEqual);

        scanner.close();
    }
}