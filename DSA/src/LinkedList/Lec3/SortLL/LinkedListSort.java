package LinkedList.Lec3.SortLL;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class LinkedListSort extends LinkedList {
    private Node midNode(Node root) {
        Node slow = root, fast = root;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node head1, Node head2) {
        Node dummyHead = new Node(0);
        Node trav = dummyHead;
        while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                trav.next = head1;
                head1 = head1.next;
            }
            else {
                trav.next = head2;
                head2 = head2.next;
            }
            trav = trav.next;
        }
        if(head1 != null) trav.next = head1;
        else if(head2 != null) trav.next = head2;

        return dummyHead.next;
    }

    private Node mergeSort(Node root) {
        if(root == null || root.next == null) return root;
        Node mid = midNode(root);
        Node right = mid.next;
        mid.next = null;
        Node sortedHead1 = mergeSort(root);
        Node sortedHead2 = mergeSort(right);
        return sortedMerge(sortedHead1, sortedHead2);
    }

    public void sort() {
        head = mergeSort(head);
    }
}
