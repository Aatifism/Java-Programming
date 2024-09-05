
import java.util.Scanner;

public class makeEqualStr {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int count=0;
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        String c=scan.nextLine();

        int len=a.length();
        int len1=b.length();
        int len2=c.length();
        int result=-1;
        
        if(len==len1 && len1==len2){
            
            
           System.out.println(result);
        
        }
        else{
            int min=Math.min(len,Math.min(len1, len2));
            if(len>min){
                count++;
            }
             if(len1>min){
                count++;
            }
             if(len2>min){
                count++;
            }
            for(int i=0;i<min;i++){
             sb.append(a.charAt(i));
            }
            
            for(int j=0;j<min;j++){
                sb1.append(b.charAt(j));
               }
               for(int k=0;k<min;k++){
                sb2.append(c.charAt(k));
               }
           
    
              result=count;
               System.out.println(result);
        }
      scan.close();
       }


    }