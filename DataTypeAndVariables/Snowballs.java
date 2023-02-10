package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballCount = Integer.parseInt(sc.nextLine()); //N
        double snowballValue = 0.0;

        double isHighest = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        while (snowballCount > 0) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            snowballValue = (long) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > isHighest) {
                isHighest = snowballValue;
                a = snowballSnow;
                b = snowballTime;
                c = snowballQuality;
            }
            snowballCount--;
        }

        System.out.printf("%d : %d = %.0f (%d)", a, b, isHighest, c);
//"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"
    }
}
