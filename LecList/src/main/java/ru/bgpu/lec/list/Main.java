

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
        list.visit(new Printer());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.visit(new Visitor() {
            @Override
            public void visit(Object value) {
                System.out.println(value);
            }
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.visit(value -> {
            System.out.println(value);
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.visit(value -> System.out.println(value));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.visit(System.out::println);
    }
}
