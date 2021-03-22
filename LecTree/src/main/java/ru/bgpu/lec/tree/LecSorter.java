package ru.bgpu.lec.tree;

public class LecSorter implements Visitor {

    private Comparable[] mass;
    private LecTree tree = new LecTree();
    private int currentIndex = 0;

    public LecSorter(Comparable[] mass) {
        this.mass = mass;
        for(Comparable value: mass) {
            tree.add(value);
        }
    }

    public Comparable[] sort() {
        tree.visit(this);
        return mass;
    }

    @Override
    public void visit(Object value) {
        mass[currentIndex++] = (Comparable) value;
    }
}
