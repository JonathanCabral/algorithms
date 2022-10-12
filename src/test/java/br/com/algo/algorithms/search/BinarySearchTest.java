package br.com.algo.algorithms.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    @DisplayName("recupera valor de qualquer posicao no meio")
    public void binarySearch() {
        int expected = 5;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.search(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("recupera valor na primeira posicao")
    public void binarySearch2() {
        int expected = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.search(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("recupera valor da ultima posicao")
    public void binarySearch3() {
        int expected = 42;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.search(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("Nao encontra valor requisitado e retorna -1")
    public void binarySearch4() {
        int[] arr = {0,1,2,3,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.search(arr, 43);
        assertEquals(-1, result);
    }

    //with recursion
    @Test
    @DisplayName("recursion - recupera valor de qualquer posicao no meio")
    public void recursion() {
        int expected = 5;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.recursiveSearch(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("recursion - recupera valor na primeira posicao")
    public void recursion1() {
        int expected = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.recursiveSearch(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("recursion - recupera valor da ultima posicao")
    public void recursion2() {
        int expected = 42;
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.recursiveSearch(arr, expected);
        assertEquals(expected, arr[result]);
    }

    @Test
    @DisplayName("recursion - Nao encontra valor requisitado e retorna -1")
    public void recursion3() {
        int[] arr = {0,1,2,3,5,6,7,8,9,10,14,17,19,20,42};
        int result = BinarySearch.recursiveSearch(arr, 43);
        assertEquals(-1, result);
    }

}