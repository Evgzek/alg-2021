

package lecstack;


public class LecStack {


    public static void main(String[] args) {
        LStack stack = new LStack(10);
        
        for(int i=0; i<10; i++) {
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {            
            System.out.println(stack.pop());
        }
        
    }
    
}
