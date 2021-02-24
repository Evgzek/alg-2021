package ru.bgpu.lec.tree;

public class Main {

    public static void main(String[] args) {
        LecTree tree = new LecTree(new LecTreeNode(1,
                new LecTreeNode(2,
                        new LecTreeNode(4),
                        new LecTreeNode(5,
                                null,
                                new LecTreeNode(6)
                        )
                ),
                new LecTreeNode(3)
        ));
        System.out.println(tree.height());
    }
}
