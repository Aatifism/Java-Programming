public class DectoNBase {
    public static void main(String[] args) {
        int num=5678;
        int n=21;
        String result="";
        char val='A';
        while(num!=0){
            int d=num%n;
            num=num/n;
            if(d<=16){
                result=Integer.toHexString(d).toUpperCase()+result;
            }
            else{
                d=d-10;
                while(d!=0){
                    val++;
                    d--;
                }
                result= Character.toString(val)+result;
            }
           

        }
        System.out.println(result);
        
       
    }
}

