package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String groupType = sc.nextLine();
        String day = sc.nextLine();

        double singlePrice = 0.0;

        switch (groupType) {
            case "Students":
                if (day.equals("Friday")) {
                    singlePrice = 8.45;
                } else if (day.equals("Saturday")) {
                    singlePrice = 9.80;
                } else {
                    singlePrice = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    singlePrice = 10.90;
                } else if (day.equals("Saturday")) {
                    singlePrice = 15.60;
                } else {
                    singlePrice = 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    singlePrice = 15;
                } else if (day.equals("Saturday")) {
                    singlePrice = 20;
                } else {
                    singlePrice = 22.50;
                }
        }

        double sum = singlePrice * people;

        if (people >= 30 && groupType.equals("Students")) {
            sum -= sum * 0.15;
        } else if (people >= 100 && groupType.equals("Business")) {
            double free = 10 * singlePrice;
            sum -= free;
        } else if (people >= 10 && people <= 20 && groupType.equals("Regular")) {
            sum -= sum*0.05;
        }

        System.out.printf("Total price: %.2f", sum);
    }
}
