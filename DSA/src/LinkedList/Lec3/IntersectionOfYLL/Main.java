package LinkedList.Lec3.IntersectionOfYLL;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class Main {
    private static Node findMergeNode(LinkedList list1, LinkedList list2) {
        int len1 = list1.size();
        int len2 = list2.size();
        Node head1 = list1.head;
        Node head2 = list2.head;
        int diff = len1-len2;
        if(diff > 0) {
            while(diff-->0) head1 = head1.next;
        }
        else {
            while(diff++<0) head2 = head2.next;
        }
        while(head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }

    private static void prepareYLL(LinkedList list1, LinkedList list2, int[] arr1, int[] arr2) {
        for(int i: arr1) list1.add(i);
        for(int i: arr2) list2.add(i);
        list1.tail.next = list2.head.next.next.next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        int[] arr1 = {9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        prepareYLL(list1, list2, arr1, arr2);
        list1.print();
        list2.print();
        Node mergeNode = findMergeNode(list1, list2);
        System.out.println("Merge Node: " + mergeNode.val);
    }
}
