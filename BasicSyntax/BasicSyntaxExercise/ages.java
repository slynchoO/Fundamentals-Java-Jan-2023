package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        String person = "";

        if (age <= 2) {
            person = "baby";
        } else if (age <= 13) {
            person = "child";
        } else if (age <= 19) {
            person = "teenager";
        } else if (age <= 65) {
            person = "adult";
        } else {
            person = "elder";
        }

        System.out.println(person);
    }
}
