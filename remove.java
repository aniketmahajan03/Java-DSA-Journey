import java.util.LinkedList;
import java.util.Queue;

public class remove {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (Add elements)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        System.out.println("Queue after adding elements: " + queue);

        // Dequeue (Remove element from front)
        int removedElement = queue.poll(); // Removes the first element (FIFO)
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Peek (Get the front element without removing)
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);
    }
}
