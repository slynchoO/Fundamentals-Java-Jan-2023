package fundamentals.assocArraysExer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class softUniExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, Integer> userList = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageList = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String user = input.split("-")[0];
            String language = input.split("-")[1];
            if (language.equals("banned")) {
                userList.remove(user);
                input = sc.nextLine();
                continue;
            }
            int points = Integer.parseInt(input.split("-")[2]);

            if (!userList.containsKey(user)) {
                userList.put(user, points);
            } else {
                if (userList.get(user) < points) {
                    userList.put(user, points);
                }
            }

            if (!languageList.containsKey(language)) {
                languageList.put(language, 1);
            } else {
                languageList.put(language, languageList.get(language) + 1);
            }

            input = sc.nextLine();
        }

        System.out.println("Results: ");
        userList.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));
        System.out.println("Submissions: ");
        languageList.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
    }
}
