package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = sc.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
//swap {index1} {index2}" takes two elements and swap their places

                int first = Integer.parseInt(command.split(" ")[1]); //index1
                int second = Integer.parseInt(command.split(" ")[2]); // index2

                int elem1 = numsArr[first];
                int elem2 = numsArr[second];

                numsArr[first] = elem2;
                numsArr[second] = elem1;


            } else if (command.contains("multiply")) {
// multiply {index1} {index2}" takes the element at the 1st index and
// multiplies it with the element at 2nd index. Save the product at the 1st index.

                int first = Integer.parseInt(command.split(" ")[1]); //index1
                int second = Integer.parseInt(command.split(" ")[2]); // index2

                int elem1 = numsArr[first];
                int elem2 = numsArr[second];

                int multiply = elem1*elem2;
                numsArr[first] = multiply;

            } else if (command.contains("decrease")) {
// "decrease" decreases all elements in the array with 1

                for (int i = 0; i < numsArr.length; i++) {
                    numsArr[i] -= 1;
                }

            }

            command = sc.nextLine();
        }

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr.length-1 == i) {
                System.out.printf("%d", numsArr[i]);
            } else {
                System.out.printf("%d, ", numsArr[i]);
            }
        }

    }
}
