public class waterTapping {
    public static void main(String[] args) {
        int arr[] ={2, 0, 2};
        int count=0;
    int peak = Integer.MIN_VALUE;
    int secPeak= Integer.MIN_VALUE;
    int third_peak=Integer.MIN_VALUE;
  
    for(int i:arr){
        if(i>peak){
            peak=i;
        }
    }
    for(int j:arr){
        if(j>secPeak&&j<peak){
            secPeak=j;
        }
    }
   



System.out.println(peak);
System.out.println(secPeak);
System.out.println();

for(int k=0;k<arr.length;k++){
    if(secPeak<=0){
        secPeak=peak;
    }
    System.out.println(secPeak);
  System.out.println(arr[k]);
    if(arr[k]<=secPeak){
        System.out.println("veliya varuthu");
        count=count+(secPeak-arr[k]);
     

    }
    if(arr[k]>secPeak){
        
        System.out.println("Ula varuthu");
        for(int x:arr){
            if(x>third_peak&&x<secPeak){
                 third_peak=x;
               
            }    
        }
        System.out.println("third peak"+third_peak);
        secPeak=third_peak;
        System.out.println(secPeak+ "after");
    }
 

}
System.out.println(count);

    }
}
