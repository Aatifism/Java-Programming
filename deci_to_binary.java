public class deci_to_binary {
    public static void main(String[] args) {
    int n=25;
    int a;
    String binary="";
    while(n>0){
        a=n%2;
        binary=a+binary;
        n=n/2;
        
    }
    System.out.print(binary);
}
}
