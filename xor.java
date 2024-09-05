public class xor {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";

        int result = str.charAt(0) - '0'; 
      
        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);      
            int nextDigit = str.charAt(i + 1) - '0';

            if (operation == 'A') {
                result = result & nextDigit;  
            } else if (operation == 'B') {
                result = result | nextDigit; 
            } else if (operation == 'C') {
                result = result ^ nextDigit;  
            }
        }

        System.out.println(result);  
    }
}
