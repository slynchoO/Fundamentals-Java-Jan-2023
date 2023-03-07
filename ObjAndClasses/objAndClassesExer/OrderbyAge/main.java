package fundamentals.objAndClassesExer.OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String name = input.split("\\s+")[0];
            String ID = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);

            input = sc.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList
        ) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(),
                    person.getID(), person.getAge());
        }
    }
}
