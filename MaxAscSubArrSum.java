import java.util.Scanner;

public class MaxAscSubArrSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n] ;
        for(int k=0;k<n;k++){
            arr[k]=scan.nextInt();
        }
        int sum = arr[0];  
        int maxSum = arr[0];  
        scan.close();
       for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[i-1]){
            sum+=arr[i];
        }else{
            maxSum=Math.max(maxSum, sum);
            sum=arr[i];
        }
       }

       maxSum=Math.max(maxSum, sum);
       System.out.println(maxSum);
    }
}
