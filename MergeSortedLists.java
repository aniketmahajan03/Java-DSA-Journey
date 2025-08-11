class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class MergeSortedLists {

    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(-1); // Dummy start node
        Node tail = dummy;

        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next; // return the real head
    }

    public static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // First sorted list
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        l1.next.next.next = new Node(7);

        // Second list
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        l2.next.next.next = new Node(8);

        MergeSortedLists merger = new MergeSortedLists();
        Node mergedHead = merger.mergeTwoLists(l1,l2);

        System.out.println("Merged Sorted List: ");
        printList(mergedHead);
    }
}