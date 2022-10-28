package br.com.algo.algorithms.sorting;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MergesortTest {

    @Test
    public void dummy() {
        int[] result = Mergesort.sort(new int[] {4,5,6,1,3,7,2});
    }

    @Test
    @DisplayName("Orderna array com numeros gerados aleatorios")
    public void generatedTest1() {
        int[] arr = getRandomNumbers(0, 99999);
        int[] result = Mergesort.sort(arr.clone());
        Arrays.sort(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("Ordena lista com 1 registro")
    public void test1() {
        int[] arr = {3};
        int[] result = Mergesort.sort(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    @DisplayName("Ordena lista com varios registros")
    public void test2() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Mergesort.sort(new int[]{8, 3, 5, 6, 7, 0, 9, 4, 1, 2});
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ja ordenada")
    public void test3() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Mergesort.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista com todos valores iguais")
    public void test4() {
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = Mergesort.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Ordena lista ordenada decrescente")
    public void test5() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Mergesort.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        assertArrayEquals(expected, result);
    }

    @NotNull
    private int[] getRandomNumbers(int from, int to) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++)
            arr[i] = new Random().nextInt(Math.abs(from - to));
        return arr;
    }
}