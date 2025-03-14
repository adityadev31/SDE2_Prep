package LinkedList.Lec3.SortLL;

public class Main {
    public static void main(String[] args) {
        LinkedListSort list = new LinkedListSort();
        int[] arr = {4,1,3,6,4,2,3,1,0,9};
        for(int i: arr) list.add(i);
        list.print();

        list.sort();
        list.print();
    }
}
