

package ru.bgpu.lec.list;

public class Main {
    
    public static void main(String[] args) {
        LecList list = new LecList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst("0");
        list.addByIndex(10,1);

        for(int i=0; i< list.getSize(); i++) {
            System.out.println(list.getByIndex(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Printer printer = new Printer();
        list.visit(printer);
    }
}
