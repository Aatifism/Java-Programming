

public class rangepalindrome {
    int ispal(int range){

        int rem=0;
        int div =range;
        while(div!=0){
            int d=div%10;
            rem= (rem*10)+d;
            div=div/10;
        }
        
        
       return rem;
    }
    public static void main(String[] args) {
        rangepalindrome rang = new rangepalindrome();
        int n=100,m=900;
        for(int i=n;i<=m;i++){
            if(i== rang.ispal(i)){
                System.out.print(i+" ");
            }
           
        }
    }
}
