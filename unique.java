public class unique {
    public static void main(String[] args) {
        int n=2921;
        int [] arr=new int[10];
        int count=0;
       while(n!=0){
        int d =n%10;
        if(arr[d]==0){
            count++;
        }
        arr[d]++;
        n=n/10;
       }
        System.out.println(count);

    }
}
