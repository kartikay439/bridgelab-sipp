import java.util.Scanner;

public class Basic_Calculator {
    static Scanner sc = new Scanner(System.in);

    static int input() {
        System.out.print("Enter number : ");
        return sc.nextInt();
    }

    static int addition(int m,int n) {
        return m+n;
    }
    static int subtraction(int m,int n) {
        return m-n;
    }
    static int multiplication(int m,int n) {
        return m*n;
    }
    static int division(int m,int n) throws Exception {
        if(n==0){
            throw new Exception("cant divide by zero");
        }
        return m/n;
    }


    public static void main(String[] args) throws Exception {

        System.out.print("Enter number 1 : ");
        int m = input();
        System.out.print("Enter number 2 : ");
        int n = input();

        System.out.println("Enter 1 for addition : ");
        System.out.println("Enter 2 for subtraction : ");
        System.out.println("Enter 3 for multiplication : ");
        System.out.println("Enter 4 for division : ");
        int choice  = input();



        switch (choice){
            case 1:
                System.out.println(addition(m,n));
                break;
            case 2:
                System.out.println(subtraction(m,n));
                break;
            case 3:
                System.out.println(multiplication(m,n));
                break;
            case 4:
                System.out.println(division(m,n));
                break;
            default:
                System.out.println("Invalid Choice");
                break;

        }

    }

}
