import java.util.Scanner;

public class LastDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first non-negative integer:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second non-negative integer:");
        int secondNumber = scanner.nextInt();

        boolean result = hasSameLastDigit(firstNumber, secondNumber);

        System.out.println("The two numbers have the same last digit: " + result);

        scanner.close();
    }

    public static boolean hasSameLastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}
