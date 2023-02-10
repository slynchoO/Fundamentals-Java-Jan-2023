package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenSum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numsArr.length; i++) {
            int numA = numsArr[i];

            for (int j = i+1; j < numsArr.length; j++) {
                int numB = numsArr[j];

                if (numA + numB == givenSum) {
                    System.out.println(numA + " " + numB);
                }
            }

        }

    }
}
