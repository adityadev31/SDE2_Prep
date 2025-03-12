package LinkedList.Lec2.DLL;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(9,3);
        dll.add(10,4);
        dll.print();
        System.out.println("Size: " + dll.size());
    }
}
