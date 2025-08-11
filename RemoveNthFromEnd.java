class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class RemoveNthFromEnd {

    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

         // Step 2: Move 'fast' n+1 steps ahead
        for(int i=0; i<=n; i++) {
            fast = fast.next;
        }

        // Step 3: Move both pointers until fast reaches the end
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

          // Step 4: Remove the nth node
        slow.next = slow.next.next;

        return dummy.next; // return new head
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        RemoveNthFromEnd remover = new RemoveNthFromEnd();
        head = remover.removeNthFromEnd(head,3);

        print(head);
    }
}