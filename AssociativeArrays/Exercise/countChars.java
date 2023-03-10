package fundamentals.assocArraysExer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        LinkedHashMap<Character, Integer> charsMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                charsMap.putIfAbsent(input[i].charAt(j),0);
                charsMap.put(input[i].charAt(j), charsMap.get(input[i].charAt(j))+1);
            }
        }

        charsMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
