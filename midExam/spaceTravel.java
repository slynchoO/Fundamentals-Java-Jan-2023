package fundamentals.midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class spaceTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] travelRoute = sc.nextLine().split("\\|");
        int fuel = Integer.parseInt(sc.nextLine());
        int ammunition = Integer.parseInt(sc.nextLine());

        int index = 0;
        boolean missionAboard = false;

        while (true) {
            String[] value = travelRoute[index].split(" ");
            if (value[0].equals("Titan")) {
                System.out.println("You have reached Titan, all passengers are safe.");
                break;
            }

            switch (value[0]) {
                case "Travel":
                    int lightYears = Integer.parseInt(value[1]);
                    if (fuel >= lightYears) {
                        fuel -= lightYears;
                        System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                    } else {
                        System.out.println("Mission failed.");
                        missionAboard = true;
                    }

                    break;
                case "Enemy":
                    int enemyArmor = Integer.parseInt(value[1]);
                    if (ammunition >= enemyArmor) {
                            ammunition-=enemyArmor;
                        System.out.printf("An enemy with %d armour is defeated.%n", enemyArmor);
                    } else if (enemyArmor*2 <=fuel) {
                            fuel -= (enemyArmor*2);
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n",enemyArmor);
                    } else {
                        System.out.println("Mission failed.");
                        missionAboard = true;
                    }
                    break;
                case "Repair":
                    int toAddAmmoAndFuel = Integer.parseInt(value[1]);
                    fuel+= toAddAmmoAndFuel;

                    ammunition+= (toAddAmmoAndFuel*2);

                    System.out.printf("Ammunitions added: %d.%n", toAddAmmoAndFuel*2);
                    System.out.printf("Fuel added: %d.%n", toAddAmmoAndFuel);

                    break;
            }

            if (missionAboard) {
                break;
            }
            index = (index + 1) % travelRoute.length;
        }


    }
}
