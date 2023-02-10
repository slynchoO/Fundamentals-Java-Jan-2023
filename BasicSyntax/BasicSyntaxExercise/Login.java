package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String pass = sc.nextLine();

        StringBuilder sb = new StringBuilder(username);
        String reversedUser = sb.reverse().toString();

        int counter = 0;

        while (true) {
            if (!pass.equals(reversedUser)) {
                counter++;

                if (counter == 4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }

                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.", username);
                break;
            }

            pass = sc.nextLine();

        }
    }
}
