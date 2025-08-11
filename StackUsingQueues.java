import java.util.*;
  public class StackUsingQueues {
     private Queue<integer> q1 = new LinkedList<>();
     private Queue<Integer> q2 = new LinkedList<>();

     public void push(int x) {
        q1.add(x);
     }

     public int pop() {
        if(q1.isEmpty) {
            throw new RuntimeException("Stack is empty!");
        }
        while(q1.size() > 1) {
            q2.add(q1.remove());
        }
        int topElement = q1.remove();
        swapQueues();
        return topElement;
     }
     public int top() {
        if(q1.isEmpty) {
            throw new RuntimeException("Stack is empty!");
        }
        while(q1.size() > 1) {
            q2.add(q1.remove());
        }
        int topElement = q1.peek();
        q2.add(q1.remove());
        swapQueues();
        return topElement;
     }
     public boolean isEmpty() {
        return q1.isEmpty();
     }
     private void swapQueues() {
        Queue<Integer> 
        temp = q1;
        q1 = q2;
        q2 =temp;
    }

    public static void main(String args[]) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: "+ stack.top());
        System.out.println("Pooped element: "+ stack.pop());
        System.out.println("Top element after pop:"+ stack.top());
        System.out.println("Is stack empty? "+ stack.isEmpty());
    }
}