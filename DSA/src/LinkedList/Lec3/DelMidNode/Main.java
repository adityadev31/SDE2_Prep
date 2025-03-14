package LinkedList.Lec3.DelMidNode;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class Main {

    public static Node delMidNode(Node head) {

        // counting nodes
        int count = 0;
        Node trav = head;
        while(trav != null) {
            trav = trav.next;
            count++;
        }

        // handling edge case
        if(count <= 1) {
            head = null;
            return head;
        }

        // finding mid-1
        int midPos = count / 2;
        trav = head;
        while(--midPos > 0) {
            trav = trav.next;
        }

        // reconnecting mid-1 -> mid.next
        Node nextNode = trav.next;
        trav.next = trav.next.next;
        nextNode.next = null;       // discarding the disconnected node
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {1,2,3,4,5};
        for(int i: arr) list.add(i);
        list.print();

        // delete mid node
        Node head = delMidNode(list.head);
        LinkedList.printAny(head);
    }
}
