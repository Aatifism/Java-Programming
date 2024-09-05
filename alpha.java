import java.lang.StringBuilder;

public class alpha {
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder();
        int d=1000;
        char val;

        while(d>0){
            d--;
            int rem= d%26;
            System.out.println(rem);
             val=(char)(rem+'A');
             sb.insert(0, val);
            d=d/26;
            System.out.println(rem);
        }
        System.out.println(sb.toString());
    }
}
