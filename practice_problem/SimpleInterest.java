
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (% per annum): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

 
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n✅ Simple Interest = " + simpleInterest);

        sc.close();
    }
}
