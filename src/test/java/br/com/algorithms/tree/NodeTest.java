package br.com.algorithms.tree;

import org.junit.jupiter.api.Test;

class NodeTest {

    @Test
    public void test_case_1() {
        Node node = new Node(2);
        node.insert(1);
        node.insert(3);
        node.printInOrder();
        //expected output is 1,2,3
    }

    @Test
    public void test_case_2() {
        Node node = new Node(2);
        node.insert(1);
        node.insert(3);
        node.printPreOrder();
        //expected output is 2,1,3
    }

    @Test
    public void test_case_3() {
        Node node = new Node(2);
        node.insert(1);
        node.insert(3);
        node.printPostOrder();
        //expected output is 1,3,2
    }

}