package fundamentals.midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class schoolLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = sc.nextLine().split("&");
        List<String> input = new ArrayList<>(Arrays.asList(books));

        String command = sc.nextLine();

        while (!command.equals("Done")) {
            String[] token = command.split(" \\| ");

            switch (token[0]) {
                case "Add Book":
                    if (!input.contains(token[1])) {
                        input.add(0, token[1]);
                    }
                    break;
                case "Take Book":
                    if (input.contains(token[1])) {
                        input.remove(token[1]);
                    }
                    break;
                case "Swap Books":
                    String book1 = token[1];
                    String book2 = token[2];


                    if (input.contains(book1) && input.contains(book2)) {
                        int indexOfFirst = input.indexOf(book1);
                        int indexOfSecond = input.indexOf(book2);

                        input.set(indexOfFirst, book2);
                        input.set(indexOfSecond, book1);
                    }

                    break;
                case "Insert Book":
                    if (!input.contains(token[1])) {
                        input.add(input.size(), token[1]);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(token[1]);
                    if (index >= 0 && index <= input.size() - 1) {
                        String book = input.get(index);
                        System.out.println(book);
                    }

                    break;
            }

            command = sc.nextLine();
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.print(input.get(i));
            if (i < input.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
