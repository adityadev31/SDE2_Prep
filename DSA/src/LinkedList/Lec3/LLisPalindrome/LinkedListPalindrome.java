package LinkedList.Lec3.LLisPalindrome;

import LinkedList.Lec1.Basics.LinkedList;

public class LinkedListPalindrome extends LinkedList {

    // middle node
    private Node midNode(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse a linkedlist
    private Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // compare nodes
    private boolean compare(Node head1, Node head2) {
        while(head1 != null && head2 != null) {
            if(head1.val != head2.val) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    // check if palindrome
    public boolean isPalindrome() {
        // find middle node
        Node midNode = midNode(this.head);
        // reverse the next nodes
        Node head2 = reverse(midNode.next);
        // iterate and check
        boolean isPalindrome = compare(head, head2);
        // reverse the 2nd half LL
        reverse(head2);
        return isPalindrome;
    }

}
