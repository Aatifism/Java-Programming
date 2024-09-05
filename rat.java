public class rat {
    public static void main(String[] args) {
        int rat=12;
        int unit=2;
        int arr[]={2,4,6,8,10,12,14};
        int total = rat*unit;
        int count=0;
    for(int i:arr){
        if(total>0){
            total=total-i;
            count++;
        }
    }
    System.out.println(count);
    }
}
