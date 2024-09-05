public class StringX{
    public static void main(String[] args) {
        String str="AatifAhamed";
        int len=str.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j || j==len-i-1 ){
                    System.out.print(str.charAt(j));
                 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}