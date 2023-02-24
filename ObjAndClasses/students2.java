package fundamentals.objAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students2 {
    public static class Student {
        private String firstName;
        private String secondName;
        private int age;
        private String city;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Student(String firstName, String secondName, int age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String line = sc.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String secondName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            if (isStudentExist(students, firstName, secondName)) {
                Student student = getStudent(students, firstName, secondName);

                student.setFirstName(firstName);
                student.setSecondName(secondName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, secondName, age, city);
                students.add(student);
            }


            line = sc.nextLine();
        }
        String filterCity = sc.nextLine();

        for (Student student : students
        ) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(), student.getSecondName(), student.getAge());
            }
        }

    }


    public static boolean isStudentExist(List<Student> students, String firstName, String secondName) {
        for (Student student : students
        ) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return true;
            }
        }
        return false;
    }

    public static Student getStudent(List<Student> students, String firstName, String secondName) {
        Student existingStudent = null;

        for (Student student : students
        ) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

}

