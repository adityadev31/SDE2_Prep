package LinkedList.Lec3.DetectALoop;

public class Main {
    public static void main(String[] args) {
        LinkedListLoop list = new LinkedListLoop();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.tail.next = list.head.next.next;  // ==== creating a loop ====
        System.out.println("Has Loop: " + list.hasLoop());
        System.out.println("Loop Node: " + list.loopNode().val);
    }
}
