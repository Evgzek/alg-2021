package ru.bgpu.lec.tree;

public class LecTree {


    private LecTreeNode root;

    public LecTree(LecTreeNode root) {
        this.root = root;
    }

    public LecTree() {}

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
            LecTreeNode parent;
            LecTreeNode current = root;
            while (true) {
                parent = current;
                if(current.getValue().compareTo(value) > 0) {
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(node);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if(current == null) {
                        parent.setRight(node);
                        return;
                    }
                }
            }
        }
    }

    public void visitByLevel(Visitor visitor, int level) {
        visitByLevel(visitor,level,root,1);
    }

    private void visitByLevel(Visitor visitor, int level, LecTreeNode node, int cl) {
        if(cl == level) {
            Object value = node != null ? node.getValue() : null;
            visitor.visit(value);
        } else {
            visitByLevel(visitor,level,
                    node != null ? node.getLeft() : null, cl+1
            );
            visitByLevel(visitor,level,
                    node != null ? node.getRight() : null, cl+1
            );
        }
    }

    public void visit(Visitor visitor) {
        visit(visitor,root);
    }

    public void visit(Visitor visitor, LecTreeNode node) {
        if(node != null) {
            visit(visitor, node.getLeft());
            visitor.visit(node.getValue());
            visit(visitor, node.getRight());
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        int height = height();
        for(int l=1; l <= height; l++) {
            int bCount = (int) (Math.pow(2,(height+1)) / Math.pow(2,l-2));
            visitByLevel(
                    (value) -> {
                        for(int i =0; i < bCount; i++) {
                            out.append(" ");
                        }
                        if(value != null) {
                            out.append(value);
                        } else {
                            out.append("--");
                        }
                    },
                    l
            );
            out.append("\n");
        }
        return out.toString();
    }
}
