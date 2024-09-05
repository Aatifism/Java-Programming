public class duplicateElements {
    public static void main(String[] args) {
        int [] arr={2,4,5,2,7};
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                 for(int k=j;k<len-1;k++){
                    arr[k]=arr[k+1];
                 }
                 len--;
                 j--;  
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
