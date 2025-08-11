import java.util.*;

public class QueueExample{
    public static void main(String args[]) {
        //create queue using LL
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue after adding: "+ q);

        int removedElement = q.poll(); // remove 1st element
        System.out.println("Removed element: "+ removedElement);
        System.out.println("Queue after removal: "+ q);

        //peek get the front element
        int frontElement = q.peek();
        System.out.println("Front element: "+ frontElement);
       
        //Check if the queue is empty
        boolean isEmpty = q.isEmpty();
        System.out.println("Is queue empty: "+ isEmpty);
    }
}