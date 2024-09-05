public class PinCreator {
    public static void main(String[] args) {
        char alpha = 'A';  
        char beta = 'B';   
        char gamma = 'C';  
        String pin = createPin(alpha, beta, gamma);
        System.out.println("The generated PIN is: " + pin);
    }

    public static String createPin(char alpha, char beta, char gamma) {
        return "" + alpha + beta + gamma;
    }
}
