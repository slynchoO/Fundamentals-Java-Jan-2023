package fundamentals.arraysExers;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] treasureChest = sc.nextLine().split("\\|");
        String command = sc.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");

            if (command.contains("Loot")) {
//Pick up treasure loot along the way. Insert the items at the beginning of the chest.
//If an item is already contained, don't insert it.
                for (int i = 1; i < commandParts.length; i++) {
                    boolean alreadyIn = false;

                    for (int j = 0; j < treasureChest.length; j++) {
                        if (treasureChest[j].equals(commandParts[i])) {
                            alreadyIn = true;
                            break;
                        }
                    }

                    if (!alreadyIn) {
                        String newChest = commandParts[i] + " " + String.join(" ", treasureChest);
                        treasureChest = newChest.split(" ");
                    }
                }

            } else if (command.contains("Drop")) {
// Remove the loot at the given position and add it to the end of the treasure chest.
//If the index is invalid, skip the command.

                int position = Integer.parseInt(commandParts[1]);
                if (position <= treasureChest.length - 1 && position >= 0) {
                    String remove = treasureChest[position];
                    //местя елементите с един индекс напред
                    for (int i = position; i < treasureChest.length - 1; i++) {
                        treasureChest[i] = treasureChest[i + 1];
                    }
                    treasureChest[treasureChest.length - 1] = remove;
                }

            } else if (command.contains("Steal")) {
//Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
//Print the stolen items separated by ", ":
//"{item1}, {item2}, {item3} … {itemn}"
                int steal = Integer.parseInt(commandParts[1]);

                if (steal >= 0 && steal < treasureChest.length) {
                    for (int i = 0; i < steal; i++) {
                        System.out.print(treasureChest[treasureChest.length - steal + i]);
                        if (i != steal - 1) {
                            System.out.print(", ");
                        }
                    }
                    String[] tempChest = new String[treasureChest.length - steal];
                    for (int i = 0; i < tempChest.length; i++) {
                        tempChest[i] = treasureChest[i];
                    }
                    treasureChest = tempChest;

                } else {
                    for (int i = 0; i < treasureChest.length; i++) {
                        System.out.print(treasureChest[i]);
                        if (i != steal - 1) {
                            System.out.print(", ");
                        }
                    }
                    treasureChest = new String[0];
                }
                System.out.println();
            }
            command = sc.nextLine();
        }

        //In the end, output the average treasure gain, which is the sum of all treasure items
        //length divided by the count of all items inside the chest formatted to the second decimal point:
        //"Average treasure gain: {averageGain} pirate credits."
        //If the chest is empty, print the following message:
        //"Failed treasure hunt."

        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;

        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }

        double avg = (1.0 *charCounter) / treasureChest.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", avg);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
