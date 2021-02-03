

package leckqueue;


public class LeckQueue {


    public static void main(String[] args) {
        LQueue<Integer> queue = new LQueue<>(3);
        for(int i=0; i < 12; i++) {
            queue.insert(i);
            if(queue.isFull()) {
                while(!queue.isEmpty()) {
                    System.out.println(queue.remove());
                }
            } 
        }

    }
    
}
