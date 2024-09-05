public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 0, 0, 0, 0, 0};
        int temp;
        
   for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }

    }
   }

   for(int k:arr){
    System.out.print(k);
   }
}
}