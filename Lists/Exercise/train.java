package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
//Each integer represents the number of passengers that are currently in each wagon.

        int maxCapacityInWagon = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        while (!command.equals("end")) {
            //•	Add {passengers} - add a wagon to the end with the given number of passengers
            //•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)

            String[] tokens = command.split(" ");

            if (tokens[0].equals("Add")) {
                int numToAdd = Integer.parseInt(tokens[1]);
                wagons.add(numToAdd);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacityInWagon) {
                        int newPass = wagons.get(i) + passengers;
                        wagons.remove(i);
                        wagons.add(i, newPass);
                        break;

                    }
                }
            }


            command = sc.nextLine();
        }

        for (int wagon : wagons
        ) {
            System.out.printf("%d ", wagon);
        }


    }
}
