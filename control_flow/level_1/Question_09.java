import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();

        if (counter < 1) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            System.out.println("Liftoff! 🚀");
        }

        sc.close();
    }
}
