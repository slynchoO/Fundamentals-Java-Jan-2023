package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double moneyIn = 0.0;
        double productPrice = 0.0;

        while (!input.equals("Start")) {


            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
                break;
            } else {
                moneyIn += coins;
            }

            input = sc.nextLine();

        }

        String secondInp = sc.nextLine();

        while (!secondInp.equals("End")) {
            String product = secondInp;

            if (secondInp.equals("Start")) {
                secondInp = sc.nextLine();
                continue;
            }

            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    secondInp = sc.nextLine();
                    continue;

            }

            if (moneyIn < productPrice) {
                System.out.println("Sorry, not enough money");
                secondInp = sc.nextLine();
                continue;
            } else {
                System.out.printf("Purchased %s%n", product);
            }
            moneyIn -= productPrice;
            secondInp = sc.nextLine();

        }

        System.out.printf("Change: %.2f", moneyIn);
    }

}
