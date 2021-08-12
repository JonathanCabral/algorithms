package br.com.algorithms.binarysearch;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numberDiscoverTest {

    @Test
    public void teste_case_1() {
        int choice = 2;
        List<Integer> options = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Integer number = NumberDiscover.search(options, choice);
        assertEquals(2, options.get(number));
    }

    @Test
    public void teste_case_2() {
        int choice = 10;
        List<Integer> options = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer number = NumberDiscover.search(options, choice);
        assertEquals(10, options.get(number));
    }

    @Test
    public void numero_nao_encontrado_retorna_null() {
        int choice = 20;
        List<Integer> options = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer number = NumberDiscover.search(options, choice);
        assertNull(number);
    }

}