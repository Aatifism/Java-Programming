import java.util.*;

abstract class compartment{
    public abstract String notice();
}

class ladies extends compartment{
    public  String notice(){
        return "This is ladies compartment";
    }
}
class firstclass extends compartment{
    public  String notice(){
        return "This is ladies firstclass";
    }
}
class general extends compartment{
    public  String notice(){
        return "This is ladies general";
    }
}
class luggage extends compartment{
    public  String notice(){
        return "This is ladies luggage";
    }
}

public class testcompartment{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int val=scan.nextInt();
    scan.close();

    switch(val){
        case 1:
        ladies lad = new ladies();
        System.out.println(lad.notice());
        break;

        case 2:
        firstclass fc= new firstclass();
        System.out.println(fc.notice());
        break;

        case 3:
        general gen= new general();
        System.out.println(gen.notice());
        break;

        case 4:
        luggage lug= new luggage();
        System.out.println(lug.notice());
        break;
    }
    }
}
