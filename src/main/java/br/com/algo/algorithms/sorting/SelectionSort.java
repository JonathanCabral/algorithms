package br.com.algo.algorithms.sorting;

import java.util.Arrays;

/**
 * @Description Selection sort is an algorithm that select the smallest element from an unsorted array
 * in each iteration and places that element in the begging of the unsorted list.
 * @time-complexity O(N^2)
 * @see " https://visualgo.net/en/sorting "
 */
public class SelectionSort {
    public static int[] sort(int[] arr) {
        System.out.println(Arrays.toString(arr) + "\n");
        for(int i = 0; i < arr.length; i++) {
            int posMinValue = getMinimum(arr, i);
            var minValue = arr[posMinValue];

            arr[posMinValue] = arr[i];
            arr[i] = minValue;

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int getMinimum(int[] arr, int start) {
        var posMinimumValue = start;
        for(int i = start; i < arr.length; i++) {
            if(arr[i] < arr[posMinimumValue])
                posMinimumValue = i;
        }
        return posMinimumValue;
    }
}
