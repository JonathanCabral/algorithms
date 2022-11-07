package br.com.algo.algorithms.search;

/**
 *       5       --lvl 0
 *     3   6     --lvl 1
 *    1 2    7    --lvl 2
 *
 * Existem 3 tipos de pesquisa em toda a arvore com o DFS
 *  *
 *  *  - In order ->   Left + Root + Right == [1,3,2,5,6,7] -> ROOT Node will always be somewhere in the middle
 *  *  - Pre order ->  Root + Left + Right == [5,3,1,2,6,7] -> ROOT will always be the first element
 *  *  - Post Order -> Left + Right + Root == [1,2,3,6,7,5(Root)] -> ROOT Node will always be the last element
 *
 * @TimeComplexity Best - n(log(n))
 * @TimeComplexity Worst - n(n^2)
 */
public class DeepFirstSearch {
}
