package fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int i = 0; i < firstArr.length; i++) {
            int numA = firstArr[i];
            int numB = secondArr[i];

            sum += firstArr[i];

            if (numA != numB) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

        }

        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
