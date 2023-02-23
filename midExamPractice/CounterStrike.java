package fundamentals.midExamPractive;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int energy = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        int wins = 0;
        boolean noEnergy = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (energy == 0) {
                noEnergy = true;
                break;
            } else {
                energy -= distance;
                wins++;

                if (wins % 3 == 0) {
                    energy += wins;
                }
            }

            command = sc.nextLine();
        }

        if (noEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, energy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", wins, energy);
        }

    }
}
