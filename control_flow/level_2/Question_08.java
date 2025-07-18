public class Question_08 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive number: ");
	        int number = scanner.nextInt();
	        int i = 1;

	        System.out.println("Factors of " + number + " are:");
	        while (i <= number) {
	            if (number % i == 0) {
	                System.out.println(i);
	            }
	            i++;
	        }
	    }
	}
