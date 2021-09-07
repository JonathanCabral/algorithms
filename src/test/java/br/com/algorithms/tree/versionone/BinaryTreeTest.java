package br.com.algorithms.tree.versionone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    public BinaryTree setUp() {
        this.tree = new BinaryTree();
        tree.addNode(50, "jonathan");
        tree.addNode(25, "marcos");
        tree.addNode(15, "stefania");
        tree.addNode(30, "edileuza");
        tree.addNode(75, "cicero");
        tree.addNode(85, "nathan");
        return tree;
    }

    @Test
    public void in_order() {
        tree.inOrderTransverseTree(tree.root);
    }

    @Test
    public void pre_order() {
        tree.preOrderTransverseTree(tree.root);
    }

    @Test
    public void post_order() {
        tree.postOrderTransverseTree(tree.root);
    }
}