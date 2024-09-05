
import java.util.*;


public class ugly {

    public static boolean fun(int n){
        boolean val=false;
    
        if(n%2==0){
        n=n/2;
        val=true;
        return fun(n);
        }

        else if(n%3==0)
        {
        n=n/3;
        val=true;
        return fun(n);
        }

        else if(n%5==0)
        {
        n=n/5;
        val=true;
        return fun(n);
        }


     System.out.println(val);
      return val;
        
    
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        boolean result=fun(n);
        scan.close();
        if(result){
                System.out.println("0");
            }
        else{
         System.out.println("1");
        }
        
        
        }
}