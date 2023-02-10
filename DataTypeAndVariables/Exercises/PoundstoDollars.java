package fundamentals.DataTypesandVariables;

import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pound = Double.parseDouble(sc.nextLine());

        double USD = pound * 1.36;

        System.out.printf("%.3f", USD);

    }
}
