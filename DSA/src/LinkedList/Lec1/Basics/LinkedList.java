package LinkedList.Lec1.Basics;

public class LinkedList {
    public static class Node {
        public int val;
        public Node next;
        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    // props
    public Node head, tail;

    // constructor
    public LinkedList() {
        head = tail = null;
    }

    // public methods
    public void add(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void print() {
        Node trav = head;
        while(trav != null) {
            System.out.print(trav.val);
            if(trav.next != null) System.out.print(", ");
            trav = trav.next;
        }
        System.out.println();
    }

    // to print LL from any given Head
    public static void printAny(Node h1) {
        Node trav = h1;
        while(trav != null) {
            System.out.print(trav.val);
            if(trav.next != null) System.out.print(", ");
            trav = trav.next;
        }
        System.out.println();
    }

    public int size() {
        int size = 0;
        Node trav = head;
        while(trav != null) {
            trav = trav.next;
            size++;
        }
        return size;
    }
}
