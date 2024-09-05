import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new  LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("ADD: "+q);

        q.remove(5);
        System.out.println("remove: "+q);

        q.poll();
        System.out.println("poll: "+q);

        System.out.println("peak: "+ q.peek());

        q.offer(10);
        System.out.println("offer: "+ q);

        System.out.println("Element: "+ q.element());
    }
    
}
