package br.com.algorithms.onotation;

public class RecursiveCallsCount {

    /**
     * this will take O(N) time and O(N) space
     * @param n number of times to execute
     */
    int sum(int n) {
        if (n <= 0)
            return 0;
        System.out.println(n);
        return n + sum(n-1);
    }

    /**
     * this will take O(N) space and O(1) space
     * @param n number of time to execute
     */
    int pairSumSequence (int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i+1);
        }
        return sum;
    }

    private int pairSum(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        RecursiveCallsCount rcc = new RecursiveCallsCount();
        rcc.sum(4);

        System.out.println("-------------");

        int pairSum = rcc.pairSumSequence(4);
        System.out.println(pairSum);
    }
}
