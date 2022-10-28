package br.com.algo.algorithms.sorting;

import java.util.Random;

/**
 * Quick sort é um algorithm de ordenação avançado.
 * Best Case - Todos os items estão foram de ordem e misturados
 * Worst Case - Todos os items já estão ordenados
 * Tip - Do not use quicksort with your list already sorted, or try to shuffle it before.
 *
 * @TimeComplexity Best - n(log(n))
 * @TimeComplexity Worst - n(n^2)
 */
public class QuickSort {

    public static boolean isRandomPivot = false;

    public static int[] sort(int[] array, boolean isRandomPivot) {
        QuickSort.isRandomPivot = isRandomPivot;
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        //base case
        if (lowIndex >= highIndex) return;

        int pivot = getPivot(array, lowIndex, highIndex);

        var leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static int getPivot(int[] array, int lowIndex, int highIndex) {
        if (isRandomPivot) {
            int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
            int pivot = array[pivotIndex];
            swap(array, pivotIndex, highIndex);
            return pivot;
        } else return array[highIndex];
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        var leftPointer = lowIndex;
        //since our pivot is the last index, our right must be 1 index before
        var rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {

            //move to the left until find a number greater than the pivot, or hit the rightpointer
            while (array[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;

            //move to the right the until a number less than the pivot, or hit the leftPointer
            while (array[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;

            swap(array, leftPointer, rightPointer);
        }

        //Choose the pivot in a random way, it the last value could potentially be out of order
        if (array[leftPointer] > array[highIndex])
            swap(array, leftPointer, highIndex);
        else
            leftPointer = highIndex;

        return leftPointer;
    }

    private static void swap(int[] array, int pivotIndex, int highIndex) {
        var temp = array[pivotIndex];
        array[pivotIndex] = array[highIndex];
        array[highIndex] = temp;
    }
}
