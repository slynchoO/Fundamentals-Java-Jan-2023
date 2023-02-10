package fundamentals.methodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int repeat = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(text, repeat));
    }

    public static String repeatString(String text, int repeat) {
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += text;
        }
        return result;
    }
}
