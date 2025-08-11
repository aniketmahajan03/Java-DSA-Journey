package com.accolite.assignment;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MixedChain {

    public static Node findChainIntersection(Node chain1, Node chain2) {
        if (chain1 == null || chain2 == null) {
            return null;
        }

        int len1 = getLength(chain1);
        int len2 = getLength(chain2);

        if (len1 > len2) {
            chain1 = advanceBy(chain1, len1 - len2);
        } else {
            chain2 = advanceBy(chain2, len2 - len1);
        }

        while (chain1 != null && chain2 != null) {
            if (chain1 == chain2) {
                return chain1;
            }
            chain1 = chain1.next;
            chain2 = chain2.next;
        }

        return null;
    }

    private static int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private static Node advanceBy(Node head, int steps) {
        while (steps-- > 0 && head != null) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Shared nodes
        Node common = new Node(8);
        common.next = new Node(10);

        // First chain
        Node chain1 = new Node(3);
        chain1.next = new Node(7);
        chain1.next.next = common;

        // Second chain
        Node chain2 = new Node(99);
        chain2.next = new Node(1);
        chain2.next.next = common;

        Node intersection = findChainIntersection(chain1, chain2);

        if (intersection != null) {
            System.out.println("Intersection found at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}


