package LinkedList.Lec3.MidOfLL;

import LinkedList.Lec1.Basics.LinkedList;

public class LinkedListMiddle extends LinkedList {

    public int mid() {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
