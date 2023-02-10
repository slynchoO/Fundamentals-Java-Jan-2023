package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); //брой редове

        int[] array1 = new int[n]; //масив 1
        int[] array2 = new int[n];//масив 2

        //четен ред -> първо число (втори масив); второ число (първи масив)
        //нечетен ред -> първо число (първи масив); второ число(втори масив)

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine(); //"12 34" -> split(" ") -> ["12", "34"]
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            //проверка дали е четен реда
            if ((i + 1) % 2 == 0) {
                array1[i] = secondNumber;
                array2[i] = firstNumber;
            } else {
                array1[i] = firstNumber;
                array2[i] = secondNumber;
            }
        }

        //отпечатаме масив 1
        for (int number : array1) {
            System.out.print(number + " ");
        }

        System.out.println();
        //отпечатаме масив 2
        for (int number : array2) {
            System.out.print(number + " ");
        }

    }
}
