package fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    //check if the list contains the number. If yes, print "Yes", otherwise,
                    // print "No such number"
                    int numToCheck = Integer.parseInt(tokens[1]);

                    boolean checker = false;
                    for (Integer current : numbers) {
                        if (current == numToCheck) {
                            checker = true;
                        }
                    }
                    if (checker) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    //Print even – print all the numbers that are even separated by a space
                    //Print odd – print all the numbers that are oddly separated by a space
                    String type = tokens[1];

                    if (type.equals("even")) {
                        for (int num : numbers
                             ) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                    } else if (type.equals("odd")) {
                        for (int num : numbers
                        ) {
                            if (num % 2 == 1) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    //Get sum – print the sum of all the numbers
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    //{condition} {number} – print all the numbers that fulfill that condition.
                    //The condition will be either '<', '>', ">=", "<="
                    switch (tokens[1]) {
                        case "<":
                            for (Integer current : numbers) {
                                if (current < Integer.parseInt(tokens[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer current : numbers) {
                                if (current > Integer.parseInt(tokens[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer current : numbers) {
                                if (current >= Integer.parseInt(tokens[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer current : numbers) {
                                if (current <= Integer.parseInt(tokens[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = sc.nextLine();
        }

    }
}
