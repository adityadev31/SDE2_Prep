package LinkedList.Lec3.ReverseLL;

import LinkedList.Lec1.Basics.LinkedList;

public class LinkedListReverse extends LinkedList {

    // ==== Recursive Reverse Code ====
    private Node reverseLL(LinkedList.Node root) {
        if(root == null || root.next == null) {
            return root;
        }
        Node newHead = reverseLL(root.next);
        root.next.next = root;
        root.next = null;
        return newHead;
    }

    // ==== Iterative Reverse Code ====
    private Node reverseIterativeLL() {
        Node prev = null, next = null, cur = head;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public void reverse() {
        head = reverseLL(head);
    }

    public void reverseIterative() {
        head = reverseIterativeLL();
    }
}
