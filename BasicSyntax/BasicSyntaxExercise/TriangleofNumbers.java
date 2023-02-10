package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf(row + " ");
            }
            System.out.println();
        }

    }
}
