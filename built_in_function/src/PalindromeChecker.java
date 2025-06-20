import java.util.Scanner;

public class PalindromeChecker {
    static Scanner sc = new Scanner(System.in);

    static String input() {
        System.out.print("Enter string : ");
        return sc.next();
    }

    static boolean isPalindrome(String s) {
      int low = 0;
      int high = s.length() - 1;
      while (high>low){
          if(s.charAt(high) != s.charAt(low))return false;
          high--;
          low++;
      }
      return  true;
    }

    public static void main(String[] args) {
        String s = input();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
