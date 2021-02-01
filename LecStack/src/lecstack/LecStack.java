

package lecstack;


public class LecStack {


    public static void main(String[] args) {
        LStack<Integer> stack = new LStack<>(10);
        LStack<String> stackString = new LStack<>(10);
        
        for(int i=0; i<10; i++) {
            if(i % 2 == 0) {
                stackString.push("* - "+Integer.toString(i));
            } else {
                stack.push(i);
            }
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.peek();
            System.out.println(stack.pop());
        }
        System.out.println("sum = "+sum);
        
        while (!stackString.isEmpty()) {
            System.out.println(stackString.pop());
        }
    }
    
}
