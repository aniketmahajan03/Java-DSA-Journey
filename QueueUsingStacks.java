import java.util.*;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if(s1.isEmpty() && s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek() {
        if(s1.isEmpty() && s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public  boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String args[]) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: "+ q.dequeue());
        System.out.println("peek: "+ q.peek());
        System.out.println("Qequeued: " + q.dequeue());
       
    }
}