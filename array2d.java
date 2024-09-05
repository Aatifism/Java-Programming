import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int[][] array = new int[row][col];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the elements in row: "+i);
                array[i][j] = scan.nextInt();
            }
        }
        int largest=array[0][0];
        for(int a=0;a<row;a++){
            for(int b=0;b<col;b++){
                if(array[b][a]>largest){
                    largest=array[b][a];
                }
            }
            System.out.println("The largest element is: "+largest);
        }
        scan.close();
       
    }
    
}
