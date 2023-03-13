package fundamentals.assocArraysExer;

import java.util.*;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The possible items are:
        //•	"Shadowmourne" - requires 250 Shards
        //•	"Valanyr" - requires 250 Fragments
        //•	"Dragonwrath" - requires 250 Motes

        //"Shards", "Fragments", and "Motes" are the key materials 	(case-insensitive),
        // and everything else is junk.

        LinkedHashMap<String, Integer> itemsList = new LinkedHashMap<>();
        itemsList.put("shards", 0);
        itemsList.put("fragments", 0);
        itemsList.put("motes", 0);

        while (itemsList.get("shards") < 250 && itemsList.get("fragments") < 250 && itemsList.get("motes") < 250) {
            String[] input = sc.nextLine().split(" ");

            for (int i = 1; i < input.length; i += 2) {


                if (!itemsList.containsKey(input[i].toLowerCase())) {
                    itemsList.put(input[i].toLowerCase(), 0);
                    itemsList.put(input[i].toLowerCase(), itemsList.get(input[i].toLowerCase()) + Integer.parseInt(input[i - 1]));

                } else {
                    itemsList.put(input[i].toLowerCase(), itemsList.get(input[i].toLowerCase()) + Integer.parseInt(input[i - 1]));

                }
            }
            if (itemsList.get("shards") >= 250 || itemsList.get("fragments") >= 250 ||
                    itemsList.get("motes") >= 250) {
                break;
            }
        }

        List<String> legendaryItem = new ArrayList<>();

        for (Map.Entry<String, Integer> item : itemsList.entrySet()) {
            if (item.getValue() >= 250 && item.getKey().equals("shards") ||
                    item.getValue() >= 250 && item.getKey().equals("fragments") ||
                    item.getValue() >= 250 && item.getKey().equals("motes")) {
                if (item.getKey().equals("shards")) {
                    legendaryItem.add("Shadowmourne");
                } else if (item.getKey().equals("fragments")) {
                    legendaryItem.add("Valanyr");
                } else {
                    legendaryItem.add("Dragonwrath");
                }
                itemsList.put(item.getKey(), item.getValue() - 250);

            }
        }
        System.out.printf("%s obtained!%n", legendaryItem.get(0));
        for (Map.Entry<String, Integer> material : itemsList.entrySet()) {
            System.out.printf("%s: %d%n", material.getKey().toLowerCase(), material.getValue());
        }
    }


}
