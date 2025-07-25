package level_2;
import java.util.Scanner;
public class FriendsInfo {

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
        sc.close();
    }
}
