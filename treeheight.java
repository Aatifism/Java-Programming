import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;


public class treeheight {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int value=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Tree: ");
        int n= scan.nextInt();
        LinkedHashMap<Integer,Integer> set=new LinkedHashMap<>();
        for(int i=0 ;i<n;i++){
            System.out.println("Enter the inch and feet");
            set.put(scan.nextInt(),scan.nextInt());
        }
        scan.close();
        for(Map.Entry<Integer,Integer> entry: set.entrySet()){
           value=entry.getKey()*12;
           value=value+entry.getValue();
         
           if(value>max){
            max=value;
           }
        }
        System.out.println("The Maximum Height Of The Tree Is: "+ max);

        
    }
}
