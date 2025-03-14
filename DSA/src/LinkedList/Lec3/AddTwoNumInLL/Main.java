package LinkedList.Lec3.AddTwoNumInLL;

import LinkedList.Lec1.Basics.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedListSum list1 = new LinkedListSum();
        LinkedListSum list2 = new LinkedListSum();

        int[] arr1 = {4,3,2,1};
        int[] arr2 = {9};

        for(int i: arr1) list1.add(i);
        for(int i: arr2) list2.add(i);

        LinkedList sumLL = LinkedListSum.sum2num(list1, list2);
        sumLL.print();
    }
}
