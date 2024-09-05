import java.util.Scanner;

public class PTsaar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total=72;
        int team=5;
        int total_team=total/team;
        int rem=total%team;

        System.out.println("Team members in a team "+total_team);
        System.out.println("remmaining members "+rem);
        sc.close();


    }
}
