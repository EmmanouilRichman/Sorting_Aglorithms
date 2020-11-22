package Sorting;

import java.util.Arrays;

public class selection_sort {

    public static void swap(int[] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void selectionSort(int[] array)
    {
        int n = array.length - 1;
        for(int i = n; i > 0; i--) {
            int maxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if(array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, maxIndex, i);
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
        int[] array = {20, 35, 15, 7, 55, 1, -22};
       selectionSort(array);
        System.out.println("\nSorted array");
        printArray(array);
    }
}
