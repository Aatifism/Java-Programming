import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(1,"Aatif");
        hash.put(2,"vs");
        hash.put(3,"sharan");
        hash.put(4,"sj");
        hash.put(5,"wicky");
        System.out.println("put: "+hash);

        System.out.println("Get: "+hash.get(3));
        hash.remove(4);
        System.out.println("Remove: "+hash);


        System.out.println("ContainsKey: "+hash.containsKey(2));
        System.out.println("ContainsValue: "+hash.containsValue("Aatif"));
    }
}
