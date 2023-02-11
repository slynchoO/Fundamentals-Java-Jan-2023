package fundamentals.methodsExe;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        while (!command.equals("END")) {
            int number = Integer.parseInt(command);
            boolean palindromeCheck = palindromeResult(number);

            if (palindromeCheck) {
                System.out.println(palindromeCheck);
            } else {
                System.out.println(palindromeCheck);
            }

            command = sc.nextLine();
        }

    }

    public static boolean palindromeResult(int number) {
        String unReversedNumber = String.valueOf(number);
        String reversedNumber = "";

        while (number != 0) {
            int currentNumber = number % 10;
            reversedNumber += String.valueOf(currentNumber);
            number = number / 10;
        }

        if (unReversedNumber.equals(reversedNumber)) {
            return true;
        } else {
            return false;
        }
    }
}
