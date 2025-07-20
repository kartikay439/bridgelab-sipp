package level_1;
import java.util.Scanner;
public class SpringSeason {
    public static boolean isSpring(int day, int month) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();

        boolean spring = isSpring(day, month);
        if (spring)
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
