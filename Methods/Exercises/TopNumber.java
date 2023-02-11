package fundamentals.methodsExe;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean divisible = checkDivisible(i);

            if (divisible) {
                boolean odd = checkOdd(i);
                if (odd) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean checkDivisible(int number) {
        //•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.

        int sum = 0;
        while (number != 0) {
            int currentNumber = number % 10;
            sum += currentNumber;
            number = number / 10;
        }

        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkOdd(int number) {
        //•	Holds at least one odd digit, e.g. 232, 707, 87578.
        String stringNumber = String.valueOf(number);
        boolean isOdd = false;

        for (int i = 0; i < stringNumber.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));

            if (currentNum % 2 == 1) {
                isOdd = true;
                break;
            }
        }

        if (isOdd) {
            return true;
        } else {
            return false;
        }

    }
}
