package fundamentals.methodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printInWords(Double.parseDouble(sc.nextLine()));
    }

    public static void printInWords(double grade) {
        String gradeInWords = "";

        if (grade >= 2.00 && grade <= 2.99) {
            gradeInWords = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49) {
            gradeInWords = "Poor";
        }else if (grade >= 3.50 && grade <= 4.49) {
            gradeInWords = "Good";
        }else if (grade >= 4.50 && grade <= 5.49) {
            gradeInWords = "Very good";
        }else if (grade >= 5.50 && grade <= 6.00) {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }

}
