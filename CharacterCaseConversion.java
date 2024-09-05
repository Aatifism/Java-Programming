import java.util.Scanner;

public class CharacterCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            char upperCh = Character.toUpperCase(ch);
            System.out.println(ch + " -> " + upperCh);
        } else if (Character.isUpperCase(ch)) {
            char lowerCh = Character.toLowerCase(ch);
            System.out.println(ch + " -> " + lowerCh);
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
}
