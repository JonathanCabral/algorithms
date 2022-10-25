package br.com.algo.algorithms.sorting;

/**
 * @Description Selection Sort is an in-place comparison-based sorting algorithm, that places an unsorted element at
 * a suitable place in each iteration
 * @time-complexity O(N^2)
 * @see " https://visualgo.net/en/sorting "
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {

        for(int i = 1; i < arr.length; i++)
            order(arr, i);
        return arr;
    }

    private static int[] order(int[] arr, int start) {
        var position = start;
        while(position != 0 && arr[position] < arr[position-1]) {
            var atual = arr[position];
            var anterior = arr[position-1];

            arr[position] = anterior;
            arr[position-1] = atual;

            position--;
        }
        return arr;
    }
}
