package br.com.algo.algorithms.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearSearchTest {

    @Test
    public void linearSearch() {
        int arr[] = new int[]{0, 3, 4, 1, 3, 4};

        int result = new LinearSearch().linearSearch(arr, 4);
        assertEquals(4, arr[result]);
    }

    @Test
    @DisplayName("nao encontra valor especificado e retorna -1")
    public void linearSearch2() {
        int arr[] = new int[]{0, 3, 4, 1, 3, 4};

        int result = new LinearSearch().linearSearch(arr, 5);
        assertEquals(-1, result);
    }

}