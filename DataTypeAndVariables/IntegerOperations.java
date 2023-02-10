package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        int num4 = Integer.parseInt(sc.nextLine());

        int sum = num1 + num2;
        sum /= num3;
        sum *= num4;

        System.out.println(sum);
    }
}
