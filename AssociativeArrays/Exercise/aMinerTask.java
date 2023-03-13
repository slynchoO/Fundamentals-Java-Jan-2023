package fundamentals.assocArraysExer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();


        while (!input.equals("stop")) {
            String resource = input;
            String quantity = sc.nextLine();
            if (resources.containsKey(resource)) {
                int addQuantity = Integer.parseInt(quantity);
                resources.put(resource, resources.get(resource) + addQuantity);
            } else {
                resources.put(resource, Integer.parseInt(quantity));
            }

            input = sc.nextLine();
        }

        resources.entrySet().forEach(item -> System.out.printf("%s -> %d%n", item.getKey(), item.getValue()));
    }
}
