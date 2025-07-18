public class Question_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
        }

        int youngest = ages[0], tallest = heights[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest)
                youngest = ages[i];
            if (heights[i] > tallest)
                tallest = heights[i];
        }

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}
