package LinkedList.Lec5.ReverseKgroups;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class Main {
    private static Node reverse(Node head, int k, int times) {
        if(times <= 0) return head;
        Node prev = null, next = null, curr = head;
        int count = 0;
        while(curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(curr != null) {
            head.next = reverse(curr, k, times-1);
        }
        return prev;
    }
    private static void reverseKGroup(LinkedList list, int k) {
        Node head = list.head;
        int size = list.size();
        int times = size / k;
        list.head = reverse(list.head, k, times);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i: arr) list.add(i);
        reverseKGroup(list, 3);
        list.print();
    }
}
