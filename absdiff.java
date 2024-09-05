public class absdiff {
    public static void main(String[] args) {
        int arr[]={19,12,14,16,18,20};
        int num=10;
        int diff=2;
        int count=0;
        for(int i:arr){
            if(Math.abs(i-num)<=diff){
                count++;
            }
        }
        System.out.println(count);
    }
}
