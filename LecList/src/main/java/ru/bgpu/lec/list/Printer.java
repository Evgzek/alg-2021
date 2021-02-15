package ru.bgpu.lec.list;

public class Printer implements Visitor{

    @Override
    public void visit(Object value) {
        System.out.println(value);
    }

}
