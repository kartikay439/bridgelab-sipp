public class Question_14 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter base number: ");
	        int number = scanner.nextInt();
	        System.out.print("Enter power: ");
	        int power = scanner.nextInt();

	        int result = 1;
	        int counter = 0;

	        while (counter != power) {
	            result *= number;
	            counter++;
	        }

	        System.out.println(number + " raised to the power " + power + " is: " + result);
	    }
	}
