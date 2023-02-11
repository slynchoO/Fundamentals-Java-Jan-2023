package fundamentals.methodsExe;

import java.util.Scanner;

public class AddandSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        int sum = sum(num1,num2);
        int subtract = subtract(sum,num3);

        System.out.println(subtract);

    }

    public  static  int sum(int num1, int num2) {
        int total = num1+num2;
        return total;
    }

    public static int subtract(int sum, int num3) {
        int result = sum-num3;

        return result;
    }
}
