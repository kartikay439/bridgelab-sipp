public class Question_07 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive number: ");
	        int number = scanner.nextInt();

	        System.out.println("Factors of " + number + " are:");
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0)
	                System.out.println(i);
	        }
	    }
	}
