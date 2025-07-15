import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		int sum  = num1+num2;
		System.out.println("Num1 : "+num1+" +  Num2"+num2+" = "+sum);
		sc.close();
	}
}
