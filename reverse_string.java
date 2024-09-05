import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String string=scanner.nextLine();
        scanner.close();
        char input[]=string.toCharArray();
        int i;
        for(i=input.length-1;i>=0;i--){
            System.out.print(input[i]);
        }
        


    }
    
}
