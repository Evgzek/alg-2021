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
}
