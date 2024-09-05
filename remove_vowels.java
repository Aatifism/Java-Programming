import java.util.Scanner;
public class remove_vowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String string=scanner.nextLine();
        string=string.toLowerCase();
        scanner.close();
        char input[]=string.toCharArray();
        int i;
        for(i=0;i<input.length;i++){
            if(input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u'){
                input[i]='z';
            }
        }
        System.out.println(input);
        


    }
    
}
