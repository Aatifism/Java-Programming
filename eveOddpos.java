public class eveOddpos {
    public static void main(String[] args) {
        int fistminOdd=Integer.MAX_VALUE;
        int secminOdd=Integer.MAX_VALUE;

        int fistminEve=Integer.MIN_VALUE;
        int secminEve=Integer.MIN_VALUE;
       
       
        int arr[]={1,8,0,2,3,5,6};
        for(int i=0 ;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>fistminEve){
                    secminEve=fistminEve;
                    fistminEve=arr[i];
                }             
                
            }
            else{
                    if(arr[i]<fistminOdd){
                        fistminOdd=arr[i];
                    }
                    if(arr[i]>fistminOdd && arr[i]<secminOdd){
                        secminOdd=arr[i];
                    }
            
            }
        }
        System.out.println(secminOdd+secminEve);
       

    }
}
