package fundamentals.midExamPractive;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class theLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int[] wagons = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        for (int i = 0; i < wagons.length; i++) {
            for (int j = 1; j <= 4; j++) {
                if (people == 0 || wagons[i] == 4) {
                    break;
                }
                wagons[i] += 1;
                people -= 1;
            }
        }

        if (people == 0) {
            if (checkForSpots(wagons, people)) {
                if (!isFull(wagons, people)) {

                    System.out.println("The lift has empty spots!");
                    for (int i = 0; i < wagons.length; i++) {
                        System.out.printf("%d ", wagons[i]);
                    }
                }
            } else {
                for (int i = 0; i < wagons.length; i++) {
                    System.out.printf("%d ", wagons[i]);
                }
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int i = 0; i < wagons.length; i++) {
                System.out.printf("%d ", wagons[i]);
            }
        }

    }

    private static boolean isFull(int[] seats, int people) {
        boolean checker = true;
        if (people == 0) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] != 4) {
                    checker = false;
                    break;
                }
            }
        }
        return checker;
    }

    private static boolean checkForSpots(int[] seats, int people) {
        if (people == 0) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] != 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
