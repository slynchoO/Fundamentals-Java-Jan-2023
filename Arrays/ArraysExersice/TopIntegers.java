package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < firstArr.length; i++) {
            boolean isTop = true;

            for (int j = i+1; j < firstArr.length; j++) {
                if (firstArr[i] <= firstArr[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(firstArr[i] + " ");
            }
        }

    }
}
