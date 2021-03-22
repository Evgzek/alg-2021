package ru.bgpu.lec.tree;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LecTree tree = new LecTree();
        Random random = new Random();
        Integer[] mass = new Integer[15];
        for(int i=0; i< mass.length; i++) {
            mass[i] = random.nextInt(100);
            tree.add(mass[i]);
        }
        System.out.println(Arrays.toString(mass));
        new LecSorter(mass).sort();
        System.out.println(Arrays.toString(mass));

        tree.visit(value -> System.out.print(" "+value));
    }
}
