
public class pal {
    public static boolean ispal(String str){
        int j = str.length() - 1;
        for (int i = 0; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        String str="aaabaaa";
        boolean found=false;
        int len=str.length();
        String a,b,c;
        for(int i=1;i<len-1;i++){
            a=str.substring(0,i);
            if(ispal(a)){
                for(int j=i+1;j<len;j++){
                    b=str.substring(i,j);
                    c=str.substring(j);
                    if(ispal(b)  && ispal(c)){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        found=true;
                        break;
                    }
                }
                
                }
                if(found){
                    break;
                }
            }
            if (!found) {
                System.out.println("Impossible");
            }
            
        }

       
}
