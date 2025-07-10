public class QuickSort {
    public static void main(String[] args) {
        Product[] products = {
            new Product(100.15, "Soap"),
            new Product(90.75, "Bread"),
            new Product(65.15, "Pen"),
            new Product(15.75, "Toy"),
        };

        int n = products.length;
        quicksort(products, 0, n - 1);

        for (Product p : products) {
            System.out.println("Name : " + p.name + " Price : " + p.price);
        }
    }

    static void quicksort(Product[] arr, int left, int right) {
        if (left < right) {
            int p = pivot(arr, left, right);
            quicksort(arr, left, p - 1);
            quicksort(arr, p + 1, right);
        }
    }

    static int pivot(Product[] arr, int left, int right) {
        Product pivot = arr[right];
        int c = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i].price <= pivot.price) {
                Product temp = arr[++c];
                arr[c] = arr[i];
                arr[i] = temp;
            }
        }
        Product temp = arr[c + 1];
        arr[c + 1] = arr[right];
        arr[right] = temp;
        return c + 1;
    }
}

class Product {
    double price;
    String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
}
