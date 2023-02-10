package fundamentals.methodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        totalPrice(product, quantity);
    }

    public static void totalPrice(String product, int quantity) {

        double price = 0.00;
//coffee, water, coke, snacks
        switch (product) {
            case "coffee":
                price = quantity * 1.50;
                break;
            case "water":
                price = quantity * 1.00;
                break;
            case "coke":
                price = quantity * 1.40;
                break;
            case "snacks":
                price = quantity * 2.00;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
