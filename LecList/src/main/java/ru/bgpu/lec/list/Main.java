

package ru.bgpu.lec.list;

public class Main {
    
    public static void main(String[] args) {
        LecList list = new LecList();
        System.out.println(list.getFirst());
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst("0");
        list.addByIndex(10,1);

        list.removeLast();
        list.removeLast();
        list.removeFirst();

        System.out.println(list);
        System.out.println("by index (1): "+list.getByIndex(1));
    }
}
