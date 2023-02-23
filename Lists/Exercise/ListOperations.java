package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();
//Note: The index given may be outside the array's bounds. In that case, print "Invalid index".

        while (!command.equals("End")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add":
                    //•	Add {number} - add number at the end
                        int toAdd = Integer.parseInt(tokens[1]);
                        numbers.add(toAdd);
                    break;
                case "Insert":
                    //•	Insert {number} {index} - insert number at given index
                    int num = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);

                    if (index <= numbers.size()) {
                        numbers.add(index,num);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    //•	Remove {index} - remove that index
                    int indexToRemove = Integer.parseInt(tokens[1]);

                    if (indexToRemove <= numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    //•	Shift left {count} - first number becomes last 'count' times
                    //•	Shift right {count} - last number becomes first 'count' times
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int first = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(first);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            int last = numbers.get(numbers.size()-1);
                            numbers.remove(numbers.size()-1);
                            numbers.add(0,last);
                        }
                    }

                    break;
            }
            command = sc.nextLine();
        }
        for (int number: numbers
             ) {
            System.out.printf("%d ", number);
        }

    }
}
