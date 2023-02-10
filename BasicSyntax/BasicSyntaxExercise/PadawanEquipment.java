package fundamentals.basicSyntaxExer;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double singleLightsaber = Double.parseDouble(sc.nextLine());
        double singleRobe = Double.parseDouble(sc.nextLine());
        double singleBelt = Double.parseDouble(sc.nextLine());

        int freeBelts = students/6;
        double neededSabers = singleLightsaber * Math.ceil((students * 1.1));

        double total = students * singleRobe + neededSabers + singleBelt*(students-freeBelts);




        if (total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total- money);
        }

    }
}
