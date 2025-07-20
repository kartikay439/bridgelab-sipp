public class FrequentCharFinder {
    public static char findMostFrequent(String str) {
        int[] count = new int[256];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        char maxChar = ' ';
        int maxCount = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(findMostFrequent("success"));
    }
}