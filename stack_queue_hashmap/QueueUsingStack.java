import java.util.*;
public class QueueUsingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
   
    void enqueue(int x) {
        input.push(x);
    }

    int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty())
                output.push(input.pop());
        }
        return output.isEmpty() ? -1 : output.pop();
    }

    boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
    	QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue()); // 10
        q.enqueue(30);
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // -1 (empty)
    }
}
