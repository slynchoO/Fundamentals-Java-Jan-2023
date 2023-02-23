package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] bombAndPower = sc.nextLine().split(" ");
        int bomb = Integer.parseInt(bombAndPower[0]);
        int power = Integer.parseInt(bombAndPower[1]);

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bomb) {
                if (i == numbers.size()-1) {
                    for (int j = 1; j <= power; j++) {
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                } else if (i == 0) {
                    for (int j = 1; j <= power; j++) {
                        numbers.remove(i + 1);
                    }
                } else {
                    for (int j = 1; j <= power; j++) {
                        if (i + 1 == numbers.size()) {
                            break;
                        }
                        numbers.remove(i + 1);
                    }
                    for (int j = 1; j <= power; j++) {
                        if (i - 1 < 0) {
                            break;
                        }
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                }
                numbers.remove(i);
                i -= 1;
            }
        }

        for (int num : numbers
             ) {
            sum += num;
        }

        System.out.println(sum);
    }
}
