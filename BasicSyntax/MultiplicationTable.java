package fundamentals.BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int multiplier = Integer.parseInt(sc.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", n, multiplier, (n * multiplier));
            multiplier++;
        }
        while (multiplier <= 10);
    }
}
