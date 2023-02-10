package fundamentals.ArraysLab;

import java.util.Scanner;

public class RevArrayofStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elements = sc.nextLine().split(" ");
        for (int i = 0; i < elements.length/2; i++) {
            String oddElement = elements[i];
            elements[i] = elements[elements.length-1-i];
            elements[elements.length-1-i] = oddElement;
        }
        System.out.println(String.join(" ", elements));

    }
}
