public class Question_06 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get an integer input
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int count = 0;

	        // Handle the case for 0 specifically
	        if (number == 0) {
	            count = 1;
	        } else {
	            // Convert to positive if number is negative
	            number = Math.abs(number);

	            // Loop until number becomes 0
	            while (number != 0) {
	                number /= 10;   // Remove last digit
	                count++;        // Increase count
	            }
	        }

	        // Display the digit count
	        System.out.println("Number of digits: " + count);

	        scanner.close();
	    }
	}
