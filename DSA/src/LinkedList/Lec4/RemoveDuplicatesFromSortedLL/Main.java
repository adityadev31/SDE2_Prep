package LinkedList.Lec4.RemoveDuplicatesFromSortedLL;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class Main {

    private static Node removeDuplicates(Node head) {
        Node n1 = head, n2 = head;
        while(n2 != null) {
            while(n2 != null && n1.val == n2.val) n2 = n2.next;
            n1.next = n2;
            n1 = n1.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {1,1,1,2,3,4};
        for(int i: arr) list.add(i);

        Node head = removeDuplicates(list.head);
        list.print();
    }
}
