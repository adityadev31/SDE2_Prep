package Sorting.BubbleSort;

public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=1; j<n-i; j++) {
                if(arr[j-1] > arr[j]) {
                    // swap
                    arr[j] = arr[j-1] + arr[j] - (arr[j-1]=arr[j]);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        printArray(arr);
    }
}
