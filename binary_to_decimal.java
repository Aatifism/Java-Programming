public class binary_to_decimal {
    public static void main(String[] args) {
        int n=101010;
        int last;
        double sum=0;
        int i=0;
        double a;

        while(n>0){
            last=n%10;
            n=n/10;
            a=last*Math.pow(2, i);
            sum=sum+a;
            i++;
        }
        System.out.println(sum);
    }
    
}
