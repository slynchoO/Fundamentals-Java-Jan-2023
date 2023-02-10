package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        int copyNum = num;
        int sum = 0;

        while (num > 0) {
            int factorel = 1;
            int number = num % 10;
            num /= 10;

            for (int i = 2; i <= number ; i++) {
                factorel *= i;
            }

            sum +=factorel;
        }

        if (sum == copyNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
