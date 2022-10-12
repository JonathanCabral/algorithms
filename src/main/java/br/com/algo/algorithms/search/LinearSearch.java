package br.com.algo.algorithms.search;

import java.util.ArrayList;
import java.util.List;

/** Linear search is the simplest algorithm for search.
 * Consists in comparing each element in the array is equal to the target.
 *
 * @Time-Complexity
 *    - Better case - O(1)
 *    - Worst case O(N)
 */
public class LinearSearch {

    /**
     * Search into the array the value passed int the target variable.
     * In case of the target does not exists, return -1.
     */
    public int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return  -1;
    }
}
