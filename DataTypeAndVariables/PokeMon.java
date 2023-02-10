package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The distance between his targets reduces his poke power.
        //TASK - subtracting M from N until N becomes less than M, i.e. the Poke Mon does not have enough
        //power to reach the next target.
        // - Every time you subtract M from N, that means you've reached a target and poked it successfully.
        // COUNT how many targets you've poked – you'll need that count.
        // - . IF N becomes equal to EXACTLY 50 % of its original value, you must divide N by Y, if it is POSSIBLE.
        // This DIVISION is between integers.If a division is not possible, you should NOT do it. Instead, you should
        // continue subtracting.
        //After dividing, you should continue subtracting from N, until it becomes less than M.
        //When N becomes less than M, you must take what has remained of N and the count of targets you've poked and
        // print them as output.

        int pokePower = Integer.parseInt(sc.nextLine()); //n
        int distanceBwTargets = Integer.parseInt(sc.nextLine()); //m
        int exhaustionFactor = Integer.parseInt(sc.nextLine()); //y

        double percent = (double)pokePower * 0.50;
        int count = 0;

        while(pokePower >= distanceBwTargets) {
            pokePower-=distanceBwTargets;
            count++;

            if (pokePower == percent && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
                break;
            }
        }

        System.out.println(pokePower);
        System.out.println(count);

    }
}
