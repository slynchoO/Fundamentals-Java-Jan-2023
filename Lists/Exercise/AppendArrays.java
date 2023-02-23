package fundamentals.ListsExerc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\|");

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            // '\\s+' - will split the string into string of array with separator as space or multiple spaces.
            String[] currentArray = input[i].split("\\s+");

            for (int j = currentArray.length - 1; j >= 0; j--) {
                if (!currentArray[j].equals("")) {
                    outputList.add(0, currentArray[j]);
                }
            }
        }
        outputList.forEach(e -> System.out.print(e + " "));

    }
}
