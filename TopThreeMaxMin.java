import java.util.Scanner;

public class TopThreeMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[20];
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int[] topThreeMax = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] topThreeMin = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        
        findTopThreeMaxMin(numbers, topThreeMax, topThreeMin);
        
        System.out.println("Top 3 maximum elements:");
        for (int max : topThreeMax) {
            System.out.print(max + " ");
        }
        
        System.out.println("\nTop 3 minimum elements:");
        for (int min : topThreeMin) {
            System.out.print(min + " ");
        }
        
        scanner.close();
    }
    
    private static void findTopThreeMaxMin(int[] array, int[] max, int[] min) {
        for (int num : array) {
                                                                        //8682913
            if (num > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = num;
            } else if (num > max[1]) {
                max[2] = max[1];
                max[1] = num;
            } else if (num > max[2]) {
                max[2] = num;
            }
            
            
            if (num < min[0]) {
                min[2] = min[1];
                min[1] = min[0];
                min[0] = num;
            } else if (num < min[1]) {
                min[2] = min[1];
                min[1] = num;
            } else if (num < min[2]) {
                min[2] = num;
            }
        }
    }
}
