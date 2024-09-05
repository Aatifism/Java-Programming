    public class exponent {
        public static void main(String[] args) {
            int maxexpo=Integer.MIN_VALUE;
            int a=2,b=6,exopo=2;
            for(int i=a;i<=b;i++){
                if(i%2==0){
                    for(int j=1;j<100;j++){
                        if(Math.pow(exopo,j)<=i){
                            if(maxexpo<j){
                                maxexpo=j;
                            }
                        }
                    
                    }
                }
            }
            System.out.println(maxexpo);
        }
    }
