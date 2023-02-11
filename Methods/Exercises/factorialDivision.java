package fundamentals.methodsExe;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        double division = factorial(num1) / factorial(num2);
        System.out.printf("%.2f", division);
    }

    public static double factorial(int number) {
        double currentSum = 1;

        for (int i = number; i > 1; i--) {
        currentSum *= i;
        }
        return currentSum;
    }
}
