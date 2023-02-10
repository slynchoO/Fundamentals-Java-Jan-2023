package fundamentals.methodsLab;

import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        if (number < 0) {
            number = Math.abs(number);
        }

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int number) {
        int evenSum = 0;

        while (number != 0) {
            // num = num/10
            int digits = number % 10;
            if (digits % 2 == 0) {
                evenSum += digits;
            }
            number /= 10;

        }

        return evenSum;
    }

    public static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number != 0) {
            // num = num/10
            int digits = number % 10;
            if (digits % 2 == 1) {
                oddSum += digits;
            }
            number /= 10;

        }
        return oddSum;
    }
}
