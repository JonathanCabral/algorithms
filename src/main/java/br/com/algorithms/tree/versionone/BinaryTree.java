package br.com.algorithms.tree.versionone;

public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if(this.root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;
                if(key < focusNode.key) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if(focusNode == null ) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTransverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTransverseTree(focusNode.left);
            System.out.println(focusNode);
            inOrderTransverseTree(focusNode.right);
        }
    }

    public void preOrderTransverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            inOrderTransverseTree(focusNode.left);
            inOrderTransverseTree(focusNode.right);
        }
    }

    public void postOrderTransverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTransverseTree(focusNode.left);
            inOrderTransverseTree(focusNode.right);
            System.out.println(focusNode);
        }
    }
}
