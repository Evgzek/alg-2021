
package leckqueue;


public class LQueue<T> {
    
    private T[] values;
    private int index;
    private int front;

    public LQueue(int size) {
        index = -1;
        front = 0;
        values = (T[]) new Object[size+1];
    }
    
    public void insert(T value) {
        if(index >= values.length-1) {
            index = -1;
        }
        values[++index] = value;
    }
    
    public T remove() {
        T temp = values[front++];
        if(front == values.length) {
            front = 0;
        }
        return temp;
    }
    
    public T peekFront() {
        return values[front];
    }
    
    public boolean isEmpty() {
        return front == index+1 || front == index + 1 - values.length;
    }
    
    public boolean isFull() {
        return front == index+2 || front == index+2 - values.length;
    }

    public int size() {
        if(index+1 >= front) {
            return index - front+1;
        } else {
            return values.length+index-front+1;
        }
    }
}
