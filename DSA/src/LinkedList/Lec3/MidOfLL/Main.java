package LinkedList.Lec3.MidOfLL;

public class Main {
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        int midVal = list.mid();
        System.out.println("Mid: " + midVal);
    }
}
