import java.util.*;
public class stasck {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);

        System.out.println("Push: "+ stack);

        stack.pop();
        System.out.println("Pop: "+ stack);

        System.out.println("Peek: "+ stack.peek());

        System.out.println("empty: "+ stack.empty());
            
        System.out.println("search: "+ stack.search(6));
        
    }
}
