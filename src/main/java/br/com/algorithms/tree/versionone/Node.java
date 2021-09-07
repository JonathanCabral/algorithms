package br.com.algorithms.tree.versionone;

public class Node {

    int key;
    String name;

    Node left;
    Node right;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " has a key: " + key;
    }
}
