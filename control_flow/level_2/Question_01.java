public class Question_01 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a natural number: ");
	        int num = scanner.nextInt();

	        for (int i = 1; i <= num; i++) {
	            if (i % 2 == 0)
	                System.out.println(i + " is Even");
	            else
	                System.out.println(i + " is Odd");
	        }
	    }
	}
