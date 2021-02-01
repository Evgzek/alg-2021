

package lecstack;


public class LStack {
    
    private int[] values;
    private int index;

    public LStack(int size) {
        index = -1;
        values = new int[size];
    }
    
    public void push(int value) {
        values[++index] = value;
    }
    
    public int pop() {
        return values[index--];
    }
    
    public int peek() {
        return values[index];
    }
    
    public boolean isEmpty() {
        return index == -1;
    }
    
    public boolean isFull() {
        return index == values.length-1;
    }
}
