package fundamentals.assocArraysExer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, Double> quantityList = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceList = new LinkedHashMap<>();


        while (!input.equals("buy")) {
            String[] token = input.split(" ");

            String name = token[0];
            Double price = Double.parseDouble(token[1]);
            Double quantity = Double.parseDouble(token[2]);

            if (!quantityList.containsKey(name)) {
                quantityList.put(name, quantity);
                priceList.put(name, price);
            } else {
                double oldQuantity = quantityList.get(name);
                quantityList.put(name, oldQuantity + quantity);
                if (priceList.containsKey(name)) {
                    double oldPrice = priceList.get(name);
                    if (oldPrice != price) {
                        priceList.put(name, price);
                    }
                }
            }
            input = sc.nextLine();
        }

        if (input.equals("buy")) {
            for (String name : quantityList.keySet()
                 ) {
                double quantity = quantityList.get(name);
                double price = priceList.get(name);

                double total = quantity*price;

                System.out.printf("%s -> %.2f%n", name, total);
            }
        }
    }
}
