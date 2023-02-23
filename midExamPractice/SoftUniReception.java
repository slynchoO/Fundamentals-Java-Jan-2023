package fundamentals.midExamPractive;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //number of students an employee can help in an hour
        int employee1 = Integer.parseInt(sc.nextLine());
        int employee2 = Integer.parseInt(sc.nextLine());
        int employee3 = Integer.parseInt(sc.nextLine());

        int studentsCount = Integer.parseInt(sc.nextLine());

        //Every fourth hour, all employees have a break, so they don't work for an hour.

        int hours = 0;

        int totalStudentsPerHour = employee1 + employee2 + employee3;

        while (studentsCount > 0) {
            hours++;

            if (hours % 4 == 0) {
                continue;
            }

            studentsCount -= totalStudentsPerHour;

            if (studentsCount < 0) {
                break;
            }
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
