package LinkedList.Lec3.AddTwoNumInLL;

import LinkedList.Lec1.Basics.LinkedList;
import LinkedList.Lec1.Basics.LinkedList.Node;

public class LinkedListSum extends LinkedList {
    public static LinkedList sum2num(LinkedList list1, LinkedList list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        Node head1 = list1.head;
        Node head2 = list2.head;

        LinkedList ans = new LinkedList();

        int carry = 0;
        while(head1 != null || head2 != null || carry != 0) {
            int sum = 0;
            if(head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            sum += carry;
            ans.add(sum%10);
            carry = sum/10;
        }
        return ans;
    }
}
