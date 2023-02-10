package fundamentals.BasicSyntax;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        // n = how many ODD numers to print;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }

        System.out.printf("Sum: %d", sum);

    }
}
