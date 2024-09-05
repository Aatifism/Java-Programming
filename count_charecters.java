import java.util.Scanner;;
public class count_charecters {
    public static void main(String[] args) {
        char i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine().toLowerCase();
        char chararray[]=input.toCharArray();
        scanner.close();
       
        for(i='a';i<='z';i++){
            int count=0;
            for(char value:chararray){
                if(value==i){
                    count=count+1;
                }

            }
             System.out.println("The character " + i +" is repeated:" + count + "Times");
        }

    }
}
