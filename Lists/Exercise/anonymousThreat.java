package fundamentals.ListsExerc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String command = sc.nextLine();

        while (!command.equals("3:1")) {
            //•	merge {startIndex} {endIndex}
            //•	divide {index} {partitions}

            String[] tokens = command.split(" ");

            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                // проверка за индексите
                boolean isStartIndexValid = isValidIndex(startIndex, input.size());
                boolean isEndIndexValid = isValidIndex(endIndex, input.size());

                //ако са валидни и двата
                if (isStartIndexValid && isEndIndexValid) {
                    //{abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
                    StringBuilder resultMerge = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        resultMerge.append(input.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        input.remove(startIndex);
                    }
                    input.add(startIndex, resultMerge.toString());
                }

            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);

                String elementForDivide = input.get(index);
                //{abcdef, ghi, jkl} -> {ghi, jkl}
                input.remove(index);
                //"abcdef" -> 6 / 3 = 2
                int partSize = elementForDivide.length() / partitions;
                int begin = 0;

                for (int part = 1; part < partitions; part++) {
                    input.add(index, elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }
                input.add(index, elementForDivide.substring(begin));

            }
            command = sc.nextLine();
        }
        System.out.println(String.join(" ", input));

    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }

    public static class AppendArrays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split("\\|");

            List<String> outputList = new ArrayList<>();

            for (int i = 0; i < input.length; i++) {
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
}
