package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        double headsetTotal = (lostGamesCount / 2) * headsetPrice;
        double mouseTotal = (lostGamesCount / 3) * mousePrice;
        double keyboardTotal = (lostGamesCount / 6) * keyboardPrice;
        double displayTotal = (lostGamesCount / 12) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", headsetTotal+mouseTotal+keyboardTotal+displayTotal);


    }
}
