package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

//The game is over when one of the decks is left without any cards.
        while (!(firstPlayer.size() < 1) && !(secondPlayer.size() < 1)) {
            if (firstPlayer.get(0) > secondPlayer.get(0)) {
                //kogato pyrviqt ima po-golqma karta
                int firstPlayerCard = firstPlayer.get(0); //20
                int secondPlayerCard = secondPlayer.get(0); //10

                firstPlayer.remove(0);
                secondPlayer.remove(0);

                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);

            } else if (firstPlayer.get(0) < secondPlayer.get(0)) {
                // vtoriqt e s po-golqma karta
                int firstPlayerCard = firstPlayer.get(0); //20
                int secondPlayerCard = secondPlayer.get(0); //10

                firstPlayer.remove(0);
                secondPlayer.remove(0);

                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);

            } else {
                //ravni
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }
//You have to print the winner on the console and the sum of the left cards:
// "{First/Second} player wins! Sum: {sum}".

        int sum = 0;

        if (firstPlayer.size() > secondPlayer.size()) {
            for (int card : firstPlayer
            ) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int card : secondPlayer
            ) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
