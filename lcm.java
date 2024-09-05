public class lcm{
    public static void main(String[] args) {
        int n=12;
        int n1=16;
        int hcf=0;
        for(int i=1;i<n;i++){
            if(n%i==0 && n1%i==0){
                hcf=i;
            }
        }
        System.out.println("Hcf: "+hcf);
        int lcm=(n*n1)/hcf;
        System.out.println("lcm: "+lcm);


    }
}