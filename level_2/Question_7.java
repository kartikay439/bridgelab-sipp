//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c,
// a * b + c,
// c + a / b,
// and a % b + c.
//
// Please also understand the precedence of the operators.
//
//
// Hint =>
//Create variables a, b, and c of int data type.
//Take user input for a, b, and c.
//Compute 3 integer operations and assign the result to a variable
//Finally, print the result and try to understand operator precedence.
//I/P => fee, discountPrecent
//O/P => The results of Int Operations are ___, ___, and ___

public class Question_7 {
    public static void main(String[] args) {
        System.out.print("Enter a : ");
        int a = Question_2.sc.nextInt();
        System.out.print("Enter b : ");
        int b = Question_2.sc.nextInt();
        System.out.print("Enter c : ");
        int c = Question_2.sc.nextInt();

        System.out.println("a * b + c : "+ a * b + c);
        System.out.println("c + a / b : "+ c + a / b);
        System.out.println("a % b + c : "+ a % b + c);

    }
}
