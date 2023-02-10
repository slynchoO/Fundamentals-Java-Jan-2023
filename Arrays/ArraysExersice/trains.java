package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class trains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());
        int[] people = new int[wagons];

        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(sc.nextLine());

            System.out.print(people[i] + " ");

            sum += people[i];
        }

        System.out.printf("%n%d", sum);

    }
}
