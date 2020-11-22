package Sorting;

public class Bubble_Sort {

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static void bubblesort(int[] array) {
        int n = array.length - 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        bubblesort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
