package fundamentals.assocArraysExer;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] command = sc.nextLine().split(" : ");
        LinkedHashMap<String, List<String>> coursesList = new LinkedHashMap<>();

        while (!command[0].equals("end")) {
            String courseName = command[0];
            String studentName = command[1];

            if (!coursesList.containsKey(courseName)) {
                coursesList.put(courseName, new ArrayList<>());
                coursesList.get(courseName).add(studentName);
            } else {
                coursesList.get(courseName).add(studentName);
            }

            command = sc.nextLine().split(" : ");
        }

        for (Map.Entry<String, List<String>> entry : coursesList.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
