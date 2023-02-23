package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            //•	Delete {element} - delete all elements in the array which are equal to the given element
            //•	Insert {element} {position} - insert element at the given position

            if (tokens[0].equals("Delete")) {
                int toCheck = Integer.parseInt(tokens[1]);

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == toCheck) {
                        numbers.remove(i);
                    }
                }

            } else {
                int toAdd = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);

                numbers.add(index, toAdd);
            }
            command = sc.nextLine();

        }
        for (int number : numbers
        ) {
            System.out.printf("%d ", number);
        }
    }
}
