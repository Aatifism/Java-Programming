public class InterestRate {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide gender and age as command line arguments.");
            return;
        }

        String gender = args[0];
        int age;

     age = Integer.parseInt(args[1]);
       

        double interestRate = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestRate = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestRate = 10.5;
            }
        }

        if (interestRate != 0.0) {
            System.out.println("The percentage of interest is: " + interestRate + "%");
        } else {
            System.out.println("Invalid input. Please provide correct gender (Male/Female) and age (1-100).");
        }
    }
}
