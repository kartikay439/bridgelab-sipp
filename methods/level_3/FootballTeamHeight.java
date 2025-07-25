package level_3;

import java.util.Random;

public class FootballTeamHeight {
    public static int[] generateRandomHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) min = height;
        }
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights();
        System.out.println("Player heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum of heights: " + sumHeights(heights));
        System.out.println("Mean height: " + meanHeight(heights));
        System.out.println("Shortest height: " + shortestHeight(heights));
        System.out.println("Tallest height: " + tallestHeight(heights));
    }
}