package fundamentals.objAndClassesExer.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Students> studentList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine()); // count

        for (int i = 1; i <= n; i++) {
            String data = sc.nextLine();

            String firstName = data.split("\\s+")[0];
            String secondName = data.split("\\s+")[1];
            Double grade = Double.parseDouble(data.split("\\s+")[2]);

            Students student = new Students(firstName, secondName, grade);
            studentList.add(student);

        }
// order them by grade (descending)
        studentList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student : studentList
        ) {
//            System.out.println(student.getFirstName() + " " + student.getLastName()
//                    + ": " + student.getGrade());

            System.out.printf("%s %s: %.2f%n", student.getFirstName(),
                    student.getLastName(), student.getGrade());
        }
    }
}
