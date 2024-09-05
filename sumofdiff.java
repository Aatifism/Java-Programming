public class sumofdiff {
    public static void main(String[] args) {
        
        int n=3;
        int m=10;
        int isdiv=0,notdiv=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                isdiv=isdiv+i;
            }
            else{
                notdiv=notdiv+i;
            }
        }
       
        System.out.println(notdiv-isdiv);
    }
}
