package LinkedList.Lec3.DetectALoop;

import LinkedList.Lec1.Basics.LinkedList;

public class LinkedListLoop extends LinkedList {

    // detect loop in a LL
    public boolean hasLoop() {
        Node slow = head, fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        } while(fast != null && fast.next != null);
        return false;
    }

    public Node loopNode() {
        if(hasLoop() == false) return null;

        Node slow = head, fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
