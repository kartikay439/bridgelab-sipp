//Question 1
//CP - Write a program to demonstrate IllegalArgumentException
//Hint =>
//1. Define a variable of type String and take user input to assign a value
//2. Write a Method to generate the Exception. Here, use the subString() and set the start index to be greater than the end index. This will generate a runtime
//exception and abruptly stop the program.
//3. Write the Method to demonstrate IllegalArgumentException. Here, use the subString() and set the start index to be greater than the end index. This will
//generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
//4. From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

public class Question_01{
	public static void main(String[] args){
		String s = "String";
		try{
			String subString = s.substring(6,3);
		}catch(IllegalArgumentException e){
			System.out.print("IllegalArgumentException");
	}catch(RuntimeException e){
			System.out.print("RuntimeException");
	}	
	
}
}