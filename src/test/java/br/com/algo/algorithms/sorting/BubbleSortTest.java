package br.com.algo.algorithms.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void dummyTest() {
        BubbleSort.sort(new int[] {12,5,3,4,14,9});
    }

    @Test
    @DisplayName("Ordena lista com 1 registro")
    public void test1() {
        int[] arr = {3};
        int[] result = BubbleSort.sort(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("Ordena lista com varios registros")
    public void test2() {
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] result = BubbleSort.sort(new int[] {8,3,5,6,7,0,9,4,1,2});
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ja ordenada")
    public void test3() {
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] result = BubbleSort.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista com todos valores iguais")
    public void test4() {
        int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[] result = BubbleSort.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ordenada decrescente")
    public void test5() {
        int[] expected = {0, 1,2,3,4,5,6,7,8,9};
        int[] result = BubbleSort.sort(new int[] {9,8,7,6,5,4,3,2,1,0});
        assertArrayEquals(expected, result);
    }
}