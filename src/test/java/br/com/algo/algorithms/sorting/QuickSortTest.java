package br.com.algo.algorithms.sorting;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    @DisplayName("RP - Orderna array com numeros gerados aleatorios")
    public void generatedTest1() {
        int[] arr = getRandomNumbers(0, 99999);
        int[] result = QuickSort.sort(arr.clone(), true);
        Arrays.sort(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("RP - Ordena lista com 1 registro")
    public void test1() {
        int[] arr = {3};
        int[] result = QuickSort.sort(arr, true);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("RP - Ordena lista com varios registros")
    public void test2() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(new int[]{8, 3, 5, 6, 7, 0, 9, 4, 1, 2}, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("RP - Ordena lista ja ordenada")
    public void test3() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(expected, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("RP - Ordena lista com todos valores iguais")
    public void test4() {
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = QuickSort.sort(expected, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("RP - Ordena lista ordenada decrescente")
    public void test5() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, true);
        assertArrayEquals(expected, result);
    }

    // --------------------------------------------------

    @Test
    @DisplayName("Orderna array com numeros gerados aleatorios")
    public void generatedTest() {
        int[] arr = getRandomNumbers(0, 99999);
        int[] result = QuickSort.sort(arr.clone(), false);
        Arrays.sort(arr);
        assertArrayEquals(arr, result);
    }

    @NotNull
    private int[] getRandomNumbers(int from, int to) {
        int[] arr = new int[999];
        for (int i = 0; i < 999; i++)
            arr[i] = new Random().nextInt(Math.abs(from - to));
        return arr;
    }

    @Test
    @DisplayName("Ordena lista com 1 registro")
    public void test6() {
        int[] arr = {3};
        int[] result = QuickSort.sort(arr, false);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("Ordena lista com varios registros")
    public void test7() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(new int[]{8, 3, 5, 6, 7, 0, 9, 4, 1, 2}, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ja ordenada")
    public void test8() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(expected, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista com todos valores iguais")
    public void test9() {
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = QuickSort.sort(expected, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ordenada decrescente")
    public void test0() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSort.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, false);
        assertArrayEquals(expected, result);
    }

}