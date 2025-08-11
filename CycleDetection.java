class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

    public class CycleDetection {
        public boolean hasCycle(Node head) {
            Node slow = head;
            Node fast = head; // Both pointers starting from head

            while(fast != null && fast.next != null) {
                slow = slow.next; // Move's 1 step
                fast = fast.next.next; // Move's 2 steps
                if(slow == fast) //If 2 pointers meet then cycle is detected
                return true;
            }
            return false;
        }

        public static void main(String args[]) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);

            head.next.next.next.next = head.next;

            CycleDetection detector = new CycleDetection();
            System.out.println("Has Cycle: " + detector.hasCycle(head));
        }
    }
