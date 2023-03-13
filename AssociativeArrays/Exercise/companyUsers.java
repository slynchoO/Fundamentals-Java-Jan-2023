package fundamentals.assocArraysExer;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, List<String>> catalogue = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] token = input.split(" -> "); // [0] - company/ [1] - ID
            String company = token[0];
            String ID = token[1];

            if (!catalogue.containsKey(company)) {
                catalogue.put(company, new ArrayList<>());
                catalogue.get(company).add(ID);
            } else {
                boolean isThere = false;
                for (int i = 0; i < catalogue.get(company).size(); i++) {
                    if (catalogue.get(company).contains(ID)) {
                        isThere = true;
                        break;
                    }
                }
                if (!isThere) {
                    catalogue.get(company).add(ID);
                }
            }
            input = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : catalogue.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
