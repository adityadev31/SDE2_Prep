package LinkedList.Lec3.OddEvenLL;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class OddEvenLL {
    public static void separateOddEven(Node head) {
        Node oddHead = new Node(0);
        Node evenHead = new Node(0);
        Node oddTail = oddHead;
        Node evenTail = evenHead;
        Node trav = head;

        // Connect ODDs & EVENs LL
        while(trav != null) {
            // case: even
            if(trav.val%2 == 0) {
                evenTail.next = trav;
                evenTail = trav;
            }
            // case: odd
            else {
                oddTail.next = trav;
                oddTail = trav;
            }
            trav = trav.next;
        }

        // Disconnect remaining
        oddTail.next = null;
        evenTail.next = null;

        // printing results
        LinkedList.printAny(oddHead.next);  // discard dummy head
        LinkedList.printAny(evenHead.next); // discard dummy head

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i: arr) {
            list.add(i);
        }
        list.print();
        separateOddEven(list.head);
    }
}
