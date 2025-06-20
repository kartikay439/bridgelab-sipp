import java.util.Scanner;

public class NumberGuessing {
    static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc =new  Scanner(System.in);
        while(true) {
            int guess = generateRandomNumber(1,100);
            System.out.println("Guess Number : ");
            int num = sc.nextInt();
            if(num < guess){
                System.out.println("low");
            }else if(num >guess){
                System.out.println("high");
            }else {
                System.out.println("correct");
                break;
            }
        }
    }
}
