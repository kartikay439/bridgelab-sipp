public class MergeSortBooks {
	public static void main(String[] args) {
		BookM[] books = { new BookM(1050.35, "Introduction to dsa"), new BookM(999.05, "Communication and network"),
				new BookM(450.8, "Operating System Concepts"), new BookM(1500.76, "TOC Fundamentals"),
				new BookM(135.36, "Python") };

		int n = books.length;
		MergeSort(books, 0, n - 1);

		for (BookM b : books) {
			System.out.println("Book Name : " + b.name + "  Book Price : " + b.price);
		}
	}

	static void MergeSort(BookM[] arr, int i, int j) {
	    if (i >= j)
	        return;
	    int mid = i + (j - i) / 2;
	    MergeSort(arr, i, mid);
	    MergeSort(arr, mid + 1, j);
	    merge(arr, i, mid, j);
	}

	static void merge(BookM[] arr, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    BookM[] L = new BookM[n1];
	    BookM[] R = new BookM[n2];

	    for (int i = 0; i < n1; i++)
	        L[i] = arr[left + i];
	    for (int j = 0; j < n2; j++)
	        R[j] = arr[mid + 1 + j];

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        if (L[i].price <= R[j].price) {
	            arr[k++] = L[i++];
	        } else {
	            arr[k++] = R[j++];
	        }
	    }

	    while (i < n1) {
	        arr[k++] = L[i++];
	    }

	    while (j < n2) {
	        arr[k++] = R[j++];
	    }
	}


}

class BookM {
	double price;
	String name;

	public BookM(double price, String name) {
		this.price = price;
		this.name = name;
	}

}
