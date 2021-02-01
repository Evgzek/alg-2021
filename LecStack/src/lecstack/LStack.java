

package lecstack;


public class LStack {
    
    private Object[] values;
    private int index;

    public LStack(int size) {
        index = -1;
        values = new Object[size];
    }
    
    public void push(Object value) {
        values[++index] = value;
    }
    
    public Object pop() {
        return values[index--];
    }
    
    public Object peek() {
        return values[index];
    }
    
    public boolean isEmpty() {
        return index == -1;
    }
    
    public boolean isFull() {
        return index == values.length-1;
    }
}
