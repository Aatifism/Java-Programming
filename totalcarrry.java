public class totalcarrry {
    public static void main(String[] args) {
        int num1=223;
        int num2=299;
        int answer=0;
        int carry=0, count=0;
        while(num1!=0 && num2!=0){
            int d1=num1%10;
            int d2=num2%10;
        
            num1=num1/10;
            num2=num2/10;
            answer=carry+d1+d2;
            if(answer>=10){
                carry=answer/10;
                count=count+carry;
            }
        }
        System.out.println(count);
    }
}
