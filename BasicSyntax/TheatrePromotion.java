package fundamentals.BasicSyntax;

import java.util.Locale;
import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());

        double price = 0.0;


        if (age < 0) {
            System.out.println("Error!");
        } else {
            if (day.equals("weekday")) {
                if (age <= 18 || (64 < age && age <= 122)) {
                    price = 12;
                } else {
                    price = 18;
                }
            } else if (day.equals("weekend")) {
                if (age <= 18 || (64 < age && age <= 122)) {
                    price = 15;
                } else {
                    price = 20;
                }
            } else {
                if (age <= 18) {
                    price = 5;
                } else if ( age <= 64) {
                    price = 12;
                } else {
                    price = 10;
                }
            }

            System.out.printf("%.0f$", price);
        }

    }
}
