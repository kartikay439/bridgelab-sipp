
public class CountingSort {

	

	    public static void main(String[] args) {
	        int[] ages = {12, 17, 14, 10, 18, 13, 12, 16, 14, 11};

	        System.out.println("Original Ages:");
	        printArray(ages);

	        countingSort(ages);

	        System.out.println("\nSorted Ages:");
	        printArray(ages);
	    }

	    static void countingSort(int[] arr) {
	        int min = 10; 
	        int max = 18; 

	        int range = max - min + 1; 

	        int[] count = new int[range];  
	        int[] output = new int[arr.length];  

	
	        for (int age : arr) {
	            count[age - min]++;
	        }


	        for (int i = 1; i < range; i++) {
	            count[i] += count[i - 1];
	        }


	        for (int i = arr.length - 1; i >= 0; i--) {
	            int age = arr[i];
	            int pos = count[age - min] - 1;
	            output[pos] = age;
	            count[age - min]--;
	        }

	
	        System.arraycopy(output, 0, arr, 0, arr.length);
	    }

	    static void printArray(int[] arr) {
	        for (int val : arr) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }
	}

