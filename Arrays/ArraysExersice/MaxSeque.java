package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int bestLength = 0;
        int endIndex = -1;

        for (int i = 0; i < numsArr.length - 1; i++) {
            int currentNum = numsArr[i];
            int secondNum = numsArr[i + 1];

            if (currentNum == secondNum) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    endIndex = i + 1;
                }
            } else {
                length = 1;
            }
        }
        for (int i = endIndex; i > endIndex - bestLength ; i--) {
            System.out.print(numsArr[i] + " ");
        }

    }
}
