package br.com.algo.algorithms.sorting;

import java.util.Arrays;

/**
 * @See https://visualgo.net/en/sorting
 * @time-complexity O(N^2)
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        System.out.println(Arrays.toString(arr) + "\n");
        for(int index = 0; index < arr.length-1; index++) {
            for(int i = 0; i < arr.length-1; i++) {
                var atual = arr[i];
                var proximo = arr[i + 1];
                if (atual > proximo) {
                    arr[i] = proximo;
                    arr[i + 1] = atual;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}
