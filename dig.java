public class dig {
public static void main(String[] args){
    int i1=1093;
    int i2=2076;
    int i3=4987;
    int i=1;
    int res=0;
    while(i1>0)
    {
        int u1=i1%10;
        int u2=i3%10;
        int u3=i3%10;

        int max=Math.max(u1,Math.max(u2,u3));

        res= (max*i)+res;
        i=i*10;

        i1=i1/10;
        i2=i2/10;
        i3=i3/10;
    }
    
    System.out.println(res);
}
}
