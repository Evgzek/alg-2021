package ru.bgpu.lec.tree;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LecTree tree = new LecTree();
        Random random = new Random();
        for(int i=0; i<10; i++) {
            tree.add(random.nextInt(100));
        }
        System.out.println(tree.height());
        System.out.println(tree);
    }
}
