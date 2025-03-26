package Sorting.SelectionSort;

public class Main {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[i]) {
                    arr[i] = arr[j] + arr[i] - (arr[j]=arr[i]);
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
        int[] arr = {4,1,3,2,7,9,6,5};
        selectionSort(arr);
        printArray(arr);
    }
}
