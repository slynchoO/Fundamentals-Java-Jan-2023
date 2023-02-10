package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int ordersCount = Integer.parseInt(sc.nextLine());
        double price = 0.0;
        double total = 0.0;

        for (int i = 0; i < ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int daysInMonth = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());

            price = ((daysInMonth * capsulesCount) * pricePerCapsule);

            total += price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);

        }

        System.out.printf("Total: $%.2f", total);

    }
}
