package fundamentals.objAndClasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {
            int position1 = rnd.nextInt(input.length);
            int position2 = rnd.nextInt(input.length);

            String old = input[position1];
            input[position1] = input[position2];
            input[position2] = old;

        }

        System.out.println(String.join(System.lineSeparator(), input));
    }
}
