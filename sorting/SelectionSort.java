
public class SelectionSort {

    public static void main(String[] args) {
        int[] scores = {85, 72, 90, 66, 78, 88, 55};

        System.out.println("Original Scores:");
        printArray(scores);

        selectionSort(scores);

        System.out.println("\nSorted Scores (Ascending):");
        printArray(scores);
    }


    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

  
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
