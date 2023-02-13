package fundamentals.ListsLab;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i+1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i+1));
                numbers.remove(numbers.get(i+1));
                i = -1;
            }
        }

        String output = joinElementsByDelimeter(numbers, " ");
        System.out.println(output);
    }

    static String joinElementsByDelimeter(List<Double> items, String delimeter) {
        String output = "";

        for (Double item : items
        ) {
            output += (new DecimalFormat("0.#").format(item) + delimeter);
        }
        return output;

    }
}
