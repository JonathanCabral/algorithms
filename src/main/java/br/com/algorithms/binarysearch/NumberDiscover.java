package br.com.algorithms.binarysearch;

import java.util.List;

/**
 * @since August 12th, 2021
 *
 * Exemplo basico para encontrar um número
 */
public class NumberDiscover {

    public static Integer search(List<Integer> options, int choice) {
        int lower = 0;
        int max = options.size()-1;

        while (lower <= max) {
            int middle = (lower + max) / 2;
            int shot = options.get(middle);

            if(shot == choice)
                return middle;
            if (shot > choice)
                max = middle -1;
            else
                lower = middle + 1;
        }

        return null;
    }
}
