class StackException extends Exception{
	public StackException(String errorMessage){
		super(errorMessage);
	}

}
public class MyStack {
	int top;
	int arr[];
	int size = 0;
	
	public MyStack(){
		arr = new int[1];
		top = -1;
		size = 1;
	}
	
	public void push(int data) {
		if(top+1 == arr.length) {
			size = size*2;
			int[] newarr = new int[size];
			for(int i = 0;i<arr.length;i++) {
				newarr[i] = arr[i];
			}
			newarr[++top] = data;
			arr = newarr;
		}else {
			arr[++top] = data;
		}
		
		
	}
	

	
	public Integer pop() throws StackException{
		if(top == -1) {
			throw new  StackException("stack underflow");
		}
		return arr[top--];
	}
	
	public int peek() throws StackException {
		if(top == -1) {
			throw new  StackException("stack underflow");
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(5);
		s.push(10);
		s.push(50);
		
		try {
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println(s.size);
		}
	
	}
}
