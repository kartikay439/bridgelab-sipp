import java.util.Scanner;

public class Question_18 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input from the user
	        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
	        int number = sc.nextInt();

	        // Print table from 6 to 9
	        for (int i = 6; i <= 9; i++) {
	            int result = number * i;
	            System.out.println(number + " * " + i + " = " + result);
	        }

	        sc.close();
	    }
	}

