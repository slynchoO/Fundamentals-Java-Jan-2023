package fundamentals.midExamPractive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");
        List<String> charList = new ArrayList<>(Arrays.asList(numbers));

        String command = sc.nextLine();
        int numberOfMoves = 0;

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int index1 = Integer.parseInt(tokens[0]);
            int index2 = Integer.parseInt(tokens[1]);

            numberOfMoves++;

            if (index1 == index2 || index1 > charList.size() - 1 || index2 > charList.size() - 1
                    || index2 < 0 || index1 < 0) {
                int middle = charList.size() / 2;
                String text = "-" + numberOfMoves + "a";

                charList.add(middle, text);
                charList.add(middle + 1, text);


                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstChar = charList.get(index1);
                String secondChar = charList.get(index2);

                if (firstChar.equals(secondChar)) {
                    System.out.println("Congrats! You have found matching elements - " + firstChar + "!");
                    charList.remove(firstChar);
                    charList.remove(secondChar);
                } else {
                    System.out.println("Try again!");
                }
            }

            if (charList.size() == 0) {
                System.out.printf("You have won in %d turns!", numberOfMoves);
                break;
            }


            command = sc.nextLine();
        }

        if (charList.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.printf(String.join(" ", charList));
        }
    }
}
