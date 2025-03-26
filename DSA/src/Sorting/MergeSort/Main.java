package Sorting.MergeSort;

public class Main {
    private static void sortedMerge(int l, int m, int r, int[] arr) {
        int n1 = m-l+1;
        int n2 = r-m;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0; i<n1; i++) arr1[i] = arr[l+i];
        for(int i=0; i<n2; i++) arr2[i] = arr[m+1+i];
        int i=0, j=0, k=l;
        while(i<n1 && j<n2) {
            if(arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else arr[k++] = arr2[j++];
        }
        while(i<n1) arr[k++] = arr1[i++];
        while(j<n2) arr[k++] = arr2[j++];
    }

    private static void mergeSort(int l, int r, int[] arr) {
        if(l >= r) return;
        int m = l + (r-l)/2;
        mergeSort(l, m, arr);
        mergeSort(m+1, r, arr);
        sortedMerge(l, m, r, arr);
    }

    public static void mergeSort(int[] arr) {
        mergeSort(0, arr.length-1, arr);
    }

    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,2,7,9,6,5};
        mergeSort(arr);
        printArray(arr);
    }
}
