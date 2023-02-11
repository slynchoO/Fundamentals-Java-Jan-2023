package fundamentals.methodsExe;

import java.util.Scanner;

public class MiddleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input.length() % 2 == 0) {
            System.out.println(even(input));
        } else {
            System.out.println(odd(input));
        }

    }

    public static String even(String text) {
        int calcMiddle = text.length() - 2;
        int remainCharacters = calcMiddle / 2;
        String midChars = "";

        for (int i = 0; i < remainCharacters + 2; i++) {
            if (i > remainCharacters - 1){
                midChars += text.charAt(i);
            }
        }
        return midChars;
    }

    public static String odd(String text) {
        int calcMiddle = text.length() - 1;
        int remainCharacter = calcMiddle / 2;
        String midChar = "";

        for (int i = 0; i < remainCharacter + 1; i++) {
            if (i == remainCharacter){
                midChar += text.charAt(i);
            }
        }
        return midChar;
    }
}
