package fundamentals.DataTypesandVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        String newstr = "";
        char ch;

        String sum = first + second + third;

        for (int i = 0; i < sum.length(); i++) {
            ch = sum.charAt(i);
            newstr = ch+ " " + newstr;
        }
        System.out.printf("%s ", newstr);

    }
}
