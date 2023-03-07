package fundamentals.objAndClassesExer.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String data = sc.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

            if (age > 30) {
                Person person = new Person(name,age);
                personList.add(person);
            }
        }

        for (Person person : personList
             ) {
            System.out.printf("%s - %d%n", person.getName(),person.getAge());        }
    }
}
