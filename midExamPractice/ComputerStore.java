package fundamentals.midExamPractive;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double sum = 0;
        double taxes = 0;
        double total = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);

            if (price < 0) {
                System.out.println("Invalid price!");
                input = sc.nextLine();
                continue;
            } else {
                sum += price;
            }

            input = sc.nextLine();
        }

        switch (input) {
            case "special":
                //If the customer is special, he has a 10% discount on the total price with taxes.
                //The taxes are 20% of each part's price you receive.
                taxes = sum * 0.2;
                total = sum + taxes;
                total = total - (total * 0.10);
                execution(sum, taxes, total);
                break;
            case "regular":
                //The taxes are 20% of each part's price you receive.
                taxes = sum * 0.2;
                total = sum + taxes;
                execution(sum, taxes, total);
                break;
        }

    }

    public static void execution(double sum, double taxes, double total) {
        if (total <= 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
