public class Question_08 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	 
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0;
	        int temp = number;

	
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += digit;
	            temp /= 10;
	        }

	        if (number % sum == 0) {
	            System.out.println(number + " is a Harshad Number.");
	        } else {
	            System.out.println(number + " is not a Harshad Number.");
	        }

	        scanner.close();
	    }
	}
