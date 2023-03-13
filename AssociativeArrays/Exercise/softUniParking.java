package fundamentals.assocArraysExer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, String> catalogue = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split(" ");

            String command = token[0];// register / unregister
            String username = token[1];

            if (command.equals("register")) {
                String licensePlate = token[2];
                if (!catalogue.containsKey(username)) {
                    catalogue.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }

            } else if (command.equals("unregister")) {
                if (!catalogue.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    catalogue.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }

            }
        }

        for (Map.Entry<String, String> entry : catalogue.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
