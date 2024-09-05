public class pin {

    public static boolean isValidPassword(String STR) {
   
        if (STR.length() < 8 || STR.length() > 15) {
            return false;
        }

    
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialCharacter = false;

    
        for (char ch : STR.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if ("%^&*#".contains(Character.toString(ch))) {
                hasSpecialCharacter = true;
            } else if (Character.isWhitespace(ch)) {
            
                return false;
            }
        }


        return hasDigit && hasLowercase && hasUppercase && hasSpecialCharacter;
    }

    public static void main(String[] args) {
        String STR = "Codingninja#1";
        boolean result = isValidPassword(STR);

        if (result) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }
}
