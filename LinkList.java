class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
    }

    class LinkList {
        Node head;

        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;
 
            while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }

        public void printList() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public void add(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.print("Original List: ");
        list.printList();

        list.reverse();

        System.out.print("Reversed List: ");
        list.printList();
    }
}