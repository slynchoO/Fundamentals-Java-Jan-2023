package fundamentals.arraysExers;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArr = sc.nextLine().split(" ");

        String[] secondArr = sc.nextLine().split(" ");

        // обхождам всички елементи от вторият масив
        for (String secondElement : secondArr) {
// обхождам първият масив
            for (String firstElement : firstArr) {
                if (secondElement.equals(firstElement)) {
    //общ елемент в двата масива
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }
}
