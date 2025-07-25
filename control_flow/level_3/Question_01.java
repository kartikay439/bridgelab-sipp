public class Question_01 {
	public class LeapYear {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year (>= 1582): ");
	        int year = scanner.nextInt();

	        if (year < 1582) {
	            System.out.println("Year must be greater than or equal to 1582.");
	            return;
	        }

	        if (year % 4 != 0) {
	            System.out.println(year + " is not a Leap Year");
	        } else if (year % 100 != 0) {
	            System.out.println(year + " is a Leap Year");
	        } else if (year % 400 == 0) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is not a Leap Year");
	        }


	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is not a Leap Year");
	        }

	        scanner.close();
	    }
	}
