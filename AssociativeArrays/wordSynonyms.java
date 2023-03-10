package fundamentals.assocArrays;

import java.text.DecimalFormat;
import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        //•	Use LinkedHashMap (String -> ArrayList<String>) to keep track of all words.
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            //adding the key if it doesn't exist
            words.putIfAbsent(word, new ArrayList<>());
            //Add the synonym as value to the given the word.
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()
        ) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
}