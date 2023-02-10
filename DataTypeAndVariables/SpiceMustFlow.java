package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //calc total amount
        int startingYield = Integer.parseInt(sc.nextLine());
        int days = 0;

        int spices = 0;

        while (startingYield >= 100) {
            days++;
            spices += startingYield;


            if (spices >= 26) {
                spices -= 26;
            }
            startingYield -= 10;
        }

        spices -= 26;
        System.out.println(days);
        System.out.println(spices);
    }
}
