package fundamentals.DataTypesandVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String delimeter = sc.nextLine();

        System.out.println(firstName + delimeter + secondName);

    }
}
