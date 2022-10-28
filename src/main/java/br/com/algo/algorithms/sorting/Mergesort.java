package br.com.algo.algorithms.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Quick sort é um algorithm de ordenação avançado.
 * Onde o array é dividido na metade, até chegar em uma array de 1 elemento.
 * Então começa as comaparações adicionando eles em uma nova lista, mas ordenada.
 *
 * @TimeComplexity Best - n(log(n))
 * @TimeComplexity Worst - n(log(n))
 */
public class Mergesort {

    public static int[] sort(int[] arr) {
        return mergeSort(arr);
    }

    public static int[] mergeSort(int[] arr) {
        //base case
        if(arr.length == 1) return arr;

        //define onde o array vai ser quebrado arrendondado para baixo
        var middle = arr.length / 2;
        //monta primeira lista com metade do array
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        //monta a segunda lista com a outra metade do array
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        //usa de recursão para quebrar a lista direita até o array ter só 1 elemento
        int[] leftResult = mergeSort(left);
        // usa de recursão para quebrar a segunda lista até o array conter só 1 elemento
        int[] rightResult = mergeSort(right);

        //quando cada lista tiver apenas 1 elemento, começamos a fazer o merge
        //que retorna um array ordenado a partir das duas listas passadas.
        return merge(leftResult, rightResult);
    }

    private static int[] merge(int[] left, int[] right) {
        //inicia array com tamanho das duas listas somadas.
        int[] ordered = new int[left.length + right.length];

        //criamos 3 variaveis de apoio
        //i ponteiro para a primeira lista
        //j ponteiro para a segunda lista
        //k ponteiro para a primeira posição vazia do array ordernado
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            var lValue = left[i];
            var rValue = right[j];

            if(lValue < rValue) {
                ordered[k] = lValue;
                i++;
            } else {
                ordered[k] = rValue;
                j++;
            }

            k++;
        }

        //verificamos se não ficou nenhum registro sobrando na primeira lista,
        //caso tenha ficado basta adicionar ao final da lista ordernada, que os valores já estaram ordernado
        while(i < left.length) {
            ordered[k] = left[i];
            i++;
            k++;
        }

        //o mesmo vale para a segunda lista. Se tiver sobrado registros na lista,
        //basta adicionar na sequencia os registros faltante na lista ordernada..
        while(j < right.length) {
            ordered[k] = right[j];
            j++;
            k++;
        }

        return ordered;
    }

}
