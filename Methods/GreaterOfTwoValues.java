package fundamentals.methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        switch (input) {
            case "int":
                int num1 = Integer.parseInt(sc.nextLine());
                int num2 = Integer.parseInt(sc.nextLine());

                System.out.println(getMax(num1,num2));
                break;
            case "string":
                String first = sc.nextLine();
                String second = sc.nextLine();

                System.out.println(getMax(first,second));
                break;
            case "char":
                char char1 = sc.nextLine().charAt(0);
                char char2 = sc.nextLine().charAt(0);

                System.out.println(getMax(char1,char2));
                break;
        }

    }

    static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }else {
            return num2;
        }

    }

    static char getMax(char char1, char char2) {
        if (char1 > char2) {
            return char1;
        } else {
            return char2;
        }

    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }


    }
}
