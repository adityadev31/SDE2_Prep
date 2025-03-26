package Sorting.InsertionSort;

public class Main {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i=1; i<n; i++) {
            int j=i;
            while(j>0) {
                if(arr[j-1] > arr[j]) {
                    // a = b + a - (b=a)
                    arr[j-1] = arr[j] + arr[j-1] - (arr[j]=arr[j-1]);
                    j--;
                }
                else break;
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
        insertionSort(arr);
        printArray(arr);
    }
}
