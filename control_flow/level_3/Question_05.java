public class Question_05 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        int originalNumber = number;

	        while (originalNumber != 0) {

	            int digit = originalNumber % 10;

	     
	            sum += digit * digit * digit;

	            originalNumber /= 10;
	        }


	        if (sum == number) {
	            System.out.println(number + " is an Armstrong Number.");
	        } else {
	            System.out.println(number + " is not an Armstrong Number.");
	        }

	        scanner.close();
	    }
	}
