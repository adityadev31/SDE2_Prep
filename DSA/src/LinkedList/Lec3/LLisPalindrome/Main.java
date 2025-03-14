package LinkedList.Lec3.LLisPalindrome;

public class Main {
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("Is Palindrome: " + list.isPalindrome());
    }
}
