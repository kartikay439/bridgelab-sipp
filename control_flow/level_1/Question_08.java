import java.util.Scanner;

import java.util.Scanner;

public class Quetion_08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}
