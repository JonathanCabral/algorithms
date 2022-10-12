package br.com.algo.algorithms.search;

/** TO USE THE LIST MUST BE SORTED
 * @time-complexity log(n)
 */
public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            var middle = (left + right) / 2;
            var item = arr[middle];

            if(item == target) return middle;
            if(item < target)
                left = middle +1;
            if (item > target)
                right = middle -1;
        }

        return -1;
    }

    //RECURSIVE CALL
    public static int recursiveSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        return recursiveHelper(arr, target, left, right);
    }

    private static int recursiveHelper(int[] arr, int target, int left, int right) {
        //base case
        if(right < left) return -1;

        var middle = (left + right) / 2;
        var item = arr[middle];

        if(item == target) return middle;
        if(item < target)
            return recursiveHelper(arr, target, middle+1, right);
        if (item > target)
            return recursiveHelper(arr, target, left, middle-1);
        return -1;
    }
}
