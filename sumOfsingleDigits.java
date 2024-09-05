public class sumOfsingleDigits {  
    
    public int addnum(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            sum=sum+d;
        
        }
        if(sum>=10 || sum<=-10){
            n=sum;
            sum=addnum(n);
            }
            return sum;
            
        }
    
    public static void main(String [] args){
        int n=-12345;
        sumOfsingleDigits user= new sumOfsingleDigits();
        int result=user.addnum(n);
        System.out.println(result);
        
    }
}
