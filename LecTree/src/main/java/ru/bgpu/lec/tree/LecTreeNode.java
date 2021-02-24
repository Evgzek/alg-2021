package ru.bgpu.lec.tree;

public class LecTreeNode {

    private Object value;

    private LecTreeNode left = null;
    private LecTreeNode right = null;

    public LecTreeNode(Object value) {
        this.value = value;
    }

    public LecTreeNode(Object value, LecTreeNode left, LecTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public LecTreeNode getLeft() {
        return left;
    }

    public void setLeft(LecTreeNode left) {
        this.left = left;
    }

    public LecTreeNode getRight() {
        return right;
    }

    public void setRight(LecTreeNode right) {
        this.right = right;
    }
}
