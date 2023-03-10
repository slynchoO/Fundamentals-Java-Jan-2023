package fundamentals.assocArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Read an array of real numbers (double).
        double[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        //Use TreeMap<Double, Integer> named counts.
        Map<Double, Integer> counts = new TreeMap<>();

        //Pass through each input number num and increase counts (when num exists in the map) or add it with value 1.
        for (double num : nums
        ) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }

        // Pass through all numbers num in the map and print the number and its count of occurrences after
        // formatting it to a decimal place without trailing zeros (otherwise, the output will have too many
        // decimal places, e.g., 2.500000 instead of 2.5);
        for (Map.Entry<Double, Integer> entry : counts.entrySet()
        ) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}
