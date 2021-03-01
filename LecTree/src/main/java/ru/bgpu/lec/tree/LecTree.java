package ru.bgpu.lec.tree;

public class LecTree {


    private LecTreeNode root;

    public LecTree(LecTreeNode root) {
        this.root = root;
    }

    public LecTreeNode getRoot() {
        return root;
    }

    public void setRoot(LecTreeNode root) {
        this.root = root;
    }

    public int height() {
        return height(root);
    }

    private int height(LecTreeNode node) {
        if(node == null) {
            return 0;
        }
        return 1 + Math.max(
                height(node.getLeft()),
                height(node.getRight())
        );
    }

    public void add(Comparable value) {
        LecTreeNode node = new LecTreeNode(value);
        if(root == null) {
            root = node;
        } else {
            LecTreeNode parent = root;
            LecTreeNode current = root;
            while (true) {
                if(current.getValue().compareTo(value) < 0) {
                    current = current.getLeft();

                } else {
                    current = current.getRight();

                }
            }
        }
    }
}
