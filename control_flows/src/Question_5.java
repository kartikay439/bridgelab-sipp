import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean isSpring = false;

        switch (month) {
            case 3:
                if (day >= 20 && day <= 31) {
                    isSpring = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    isSpring = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    isSpring = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 2) {
                    isSpring = true;
                }
                break;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }


    }
}