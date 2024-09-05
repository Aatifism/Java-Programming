public class alphabets {
    public static void main(String[] args) {
        String a="program";
        int len=a.length();
        String x=a.substring(0,len/2);
        String y=a.substring((len/2),len);
        String result=y+x;
      
       for(int i=0;i<len;i++){
        for(int s=len-1;s>i;s--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(result.charAt(j));
        }
        System.out.println();
       }      
    }
}
