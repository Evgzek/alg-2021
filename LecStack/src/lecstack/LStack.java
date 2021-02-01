

package lecstack;

import java.lang.reflect.Array;


public class LStack <T> {
    
    private T[] values;
    private int index;

    public LStack(int size) {
        index = -1;
        values = (T[]) new Object[size];
    }
    
    public void push(T value) {
        values[++index] = value;
    }
    
    public T pop() {
        return values[index--];
    }
    
    public T peek() {
        return values[index];
    }
    
    public boolean isEmpty() {
        return index == -1;
    }
    
    public boolean isFull() {
        return index == values.length-1;
    }
}
