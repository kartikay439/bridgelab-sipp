import java.util.Scanner;

public class Question_17 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input salary
	        System.out.print("Enter employee's salary: ");
	        double salary = sc.nextDouble();

	        // Input years of service
	        System.out.print("Enter years of service: ");
	        int yearsOfService = sc.nextInt();

	        // Check and calculate bonus
	        if (yearsOfService > 5) {
	            double bonus = 0.05 * salary;
	            System.out.println("Bonus amount: ₹" + bonus);
	        } else {
	            System.out.println("No bonus. Service should be more than 5 years.");
	        }

	        sc.close();
	    }
	}
