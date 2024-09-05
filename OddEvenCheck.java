import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a digit:");
        int digit = scanner.nextInt();

        if (digit >= 0) {
            if (digit % 2 == 0) {
                System.out.println("The digit is Even.");
            } else {
                System.out.println("The digit is Odd.");
            }
        } else {
            System.out.println("Please enter a single digit (0-9).");
        }

        scanner.close();
    }
}
