package fundamentals.DataTypesandVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int digit = num;

            while (digit > 0) {
                sum += digit % 10;
                digit /= 10;
            }
                if (sum % 5 == 0 || sum % 7 == 0 || sum % 10 == 0) {
                    System.out.printf("%d -> True%n", num);
                } else {
                    System.out.printf("%d -> False%n", num);
                }
        }

    }
}
