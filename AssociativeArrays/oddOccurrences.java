package fundamentals.assocArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        //Use a LinkedHashMap (String -> int) to count the occurrences of each word
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        //Pass through all elements in the array and count each word
        for (String word : words
        ) {
            String wordInLowerCase = word.toLowerCase();

            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }

        //Create a new ArrayList (String), which will hold all the words with odd occurrences:

        ArrayList<String> odds = new ArrayList<>();

        for (var entry : counts.entrySet()
        ) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        //Now all that is left is to print the words, separated by a comma and a single space (", ").

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
