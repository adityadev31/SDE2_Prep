package LinkedList.Lec1.Basics;

public class LinkedList {
    public class Node {
        public int val;
        public Node next;
        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    // props
    public Node head, tail;
    public int size;

    // constructor
    public LinkedList() {
        head = tail = null;
        size = 0;
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
        size++;
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

    public int size() {
        return size;
    }
}
