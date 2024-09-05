// add()
// get()
// set()
// remove()
// size()
// clear()
// contains()
// indexOf()
// isEmpty()
// toArray()
import java.util.*;
public class AL {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("Aatif");

        arr.add(2);
        arr.add("Vs");

        arr.add(3);
        arr.add("sj");
        System.out.println("add: "+arr);
        
        System.out.println("Get: "+arr.get(4));

        arr.set(5,"Sharankutty");
        System.out.println("Set: "+arr);

        arr.remove("Vs");
        System.out.println("remove: "+arr);

        System.out.println("size: "+arr.size());

        System.out.println("contains: "+arr.contains("iit"));

        System.out.println("IndexOf: "+arr.indexOf("Aatif"));

        arr.clear();

        System.out.println("IsEmplty: "+arr.isEmpty());

        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        
        list.toArray();
       
        System.err.println("toarray"+list);

    }

    }

