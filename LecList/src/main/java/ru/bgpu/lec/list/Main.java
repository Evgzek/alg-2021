

package ru.bgpu.lec.list;

public class Main {
    
    public static void main(String[] args) {
        LecList list = new LecList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst("0");
        System.out.println(list);
    }
}
