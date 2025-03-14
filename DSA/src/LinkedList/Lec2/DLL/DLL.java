package LinkedList.Lec2.DLL;

public class DLL {

    private class Node {
        Node prev, next;
        int val;
        Node(int val) {
            this.val = val;
            prev = next = null;
        }
    }

    private Node head,tail;
    private int size;

    public DLL() {
        head = tail = null;
        size = 0;
    }

    // add
    void add(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    // insert at
    void add(int val, int pos) {
        Node newNode = new Node(val);

        // case: pos = 0
        if(pos == 0) {
            newNode.next = head;
            head = newNode;
        }

        // case: pos = size
        else if(pos == size) {
            tail.next = newNode;
            tail = newNode;
        }

        // case: pos > size
        else if(pos > size) {
            System.out.println("Position overflow");
            return;
        }

        // case: any mid pos
        else {
            Node trav = head;
            while(--pos != 0) {
                trav = trav.next;
            }
            Node nextNode = trav.next;
            trav.next = newNode;
            newNode.prev = trav;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        size++;
    }

    void print() {
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
