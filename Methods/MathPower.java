package fundamentals.methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat().format(mathPower(num, power)));
    }

    public static double mathPower(double num, int power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *=num;
        }

        return result;
    }
}
