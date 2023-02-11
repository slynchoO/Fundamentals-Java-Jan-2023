package fundamentals.methodsExe;

import java.util.Scanner;

public class NxNmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        matrix(n);

    }

    public static void matrix(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
