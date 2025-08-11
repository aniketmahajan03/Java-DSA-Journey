class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class FindMiddle {
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        FindMiddle finder = new FindMiddle();
        Node middle = finder.findMiddle(head);
        System.out.println("Middle Node: " + middle.data);
    }
}