package LinkedList.Lec3.ReverseLL;

public class Main {
    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // recursive reverse
        list.reverse();
        list.print();

        // iterative reverse
        list.reverseIterative();
        list.print();
    }
}
