package ru.bgpu.lec.tree;

public class LecTreeNode {

    private Comparable value;

    private LecTreeNode left = null;
    private LecTreeNode right = null;

    public LecTreeNode(Comparable value) {
        this.value = value;
    }

    public LecTreeNode(Comparable value, LecTreeNode left, LecTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Comparable getValue() {
        return value;
    }

    public void setValue(Comparable value) {
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
