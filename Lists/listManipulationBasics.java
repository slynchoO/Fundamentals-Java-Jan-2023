package fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add":
                    //Add {number}: add a number to the end of the list
                    int numToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    //Remove {number}: remove a number from the list
                    int numToRemove = Integer.parseInt(tokens[1]);
                    boolean find = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);
                        if (currentNum == numToRemove) {
                            numbers.remove(i);
                            find = true;
                        }
                    }
                    if (!find) {
                        numbers.remove(numToRemove);
                    }
                    break;
                case "RemoveAt":
                    //RemoveAt {index}: remove a number at a given index
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    //Insert {number} {index}: insert a number at a given index
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numToInsert);
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
