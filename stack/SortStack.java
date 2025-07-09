import java.util.*;


	public class SortStack {
	    static void sort(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            int top = stack.pop();
	            sort(stack);
	            insertSorted(stack, top);
	        }
	    }

	    static void insertSorted(Stack<Integer> stack, int val) {
	        if (stack.isEmpty() || stack.peek() <= val) {
	            stack.push(val);
	        } else {
	            int temp = stack.pop();
	            insertSorted(stack, val);
	            stack.push(temp);
	        }
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(30);
	        stack.push(10);
	        stack.push(50);
	        stack.push(20);
	        sort(stack);
	        while (!stack.isEmpty()) {
	            System.out.println(stack.pop()); 
	        }
	    }
	}

