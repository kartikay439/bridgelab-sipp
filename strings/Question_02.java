//Question 2
//CP - Write a program to demonstrate StringIndexOutOfBoundsException
//Hint =>
//1. Define a variable of type String and take user input to assign a value
//2. Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and
//abruptly stop the program.
//3. Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then, write try
//catch block for Exception while accessing the String method
//4. From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.*;
public class Question_02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		try{
			char a = s.charAt(n);
		}catch(StringIndexOutOfBoundsException e){
			System.out.print("StringIndexOutOfBoundsException");
	}
System.out.print("Exception handled");	
	
}
}