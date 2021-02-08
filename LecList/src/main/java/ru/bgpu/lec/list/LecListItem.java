

package ru.bgpu.lec.list;


public class LecListItem {
    
    private Object value;
    private LecListItem next;

    public LecListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public LecListItem getNext() {
        return next;
    }

    public void setNext(LecListItem next) {
        this.next = next;
    }
}
