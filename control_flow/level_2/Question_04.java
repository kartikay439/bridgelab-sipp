public class Question_04 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive number: ");
	        int number = scanner.nextInt();

	        for (int i = 1; i <= number; i++) {
	            if (i % 3 == 0 && i % 5 == 0)
	                System.out.println("FizzBuzz");
	            else if (i % 3 == 0)
	                System.out.println("Fizz");
	            else if (i % 5 == 0)
	                System.out.println("Buzz");
	            else
	                System.out.println(i);
	        }
	    }
	}
