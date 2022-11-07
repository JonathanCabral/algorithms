package br.com.algo.algorithms.structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {


    @Test
    @DisplayName("Cria uma nova arvore")
    public void teste() {
        Node root = new Node(5);
        Node root3 = new Node(3);
        Node root1 = new Node(1);
        Node root2 = new Node(2);
        Node root6 = new Node(6);
        Node root7 = new Node(7);

        root6.setRight(root7);
        root3.setLeft(root1);
        root3.setRight(root2);
        root.setRight(root6);
        root.setLeft(root3);

        System.out.println(root);
    }

}