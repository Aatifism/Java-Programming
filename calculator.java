public class calculator{
    static double powerInt(int a, int b){
        double power=Math.pow(a, b);
        return power;
    }
    static double powerDouble(double a, int b){
        double power2= Math.pow(a, b);
        return power2;
    }

    public static void main(String[] args) {
        calculator cal=new calculator();
        int i=5,j=10;
        double result=cal.powerInt(i, j);
        System.out.println(result);
    }
}