package Sorting;

import java.util.Arrays;

public class insertion_sort {

    /*
        Done like cards, look at current i element and see where it goes in the left;
     */
    public static void insertionsort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int element = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = element;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        insertionsort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
