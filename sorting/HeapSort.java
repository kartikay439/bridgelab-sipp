
public class HeapSort {

	    public static void main(String[] args) {
	        int[] salaries = {75000, 50000, 90000, 60000, 85000, 70000};

	        System.out.println("Original Salary Demands:");
	        printArray(salaries);

	        heapSort(salaries);

	        System.out.println("\nSorted Salary Demands (Ascending):");
	        printArray(salaries);
	    }

	
	    static void heapSort(int[] arr) {
	        int n = arr.length;

	       
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }


	        for (int i = n - 1; i > 0; i--) {

	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	     
	            heapify(arr, i, 0);
	        }
	    }

	
	    static void heapify(int[] arr, int n, int i) {
	        int largest = i;     
	        int left = 2 * i + 1; 
	        int right = 2 * i + 2; 

	        if (left < n && arr[left] > arr[largest]) {
	            largest = left;
	        }

	   
	        if (right < n && arr[right] > arr[largest]) {
	            largest = right;
	        }

	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;

	    
	            heapify(arr, n, largest);
	        }
	    }

	
	    static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}
