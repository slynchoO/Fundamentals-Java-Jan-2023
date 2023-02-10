package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //water tank capacity 255l

        int lines = Integer.parseInt(sc.nextLine());
        int tankCapacity = 255;
        int currentPour = 0;

        for (int i = 1; i <= lines; i++) {
            int pour = Integer.parseInt(sc.nextLine());

            if (currentPour + pour > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                currentPour += pour;
            }


        }

        System.out.println(currentPour);

    }
}
