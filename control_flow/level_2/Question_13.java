public class Question_13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number less than 100: ");
	        int number = scanner.nextInt();

	        if (number >= 100 || number <= 0) {
	            System.out.println("Invalid input. Number must be between 1 and 99.");
	            return;
	        }

	        int counter = 99; // Start from 99 to go below 100

	        System.out.println("Multiples of " + number + " below 100:");
	        while (counter > 1) {
	            if (counter % number == 0) {
	                System.out.println(counter);
	            }
	            counter--;
	        }
	    }
	}
