package fundamentals.dataTypeAndVarLab;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int interval = Integer.parseInt(sc.nextLine());

        String model = "";
        double maxValue = MIN_VALUE;
        double volume = 0.0;


        while (interval > 0) {

            String CurrModel = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            volume = Math.PI * radius*radius * height;

            if (volume > maxValue) {
                model = CurrModel;
                maxValue = volume;
            }

            interval--;

        }

        System.out.println(model);
    }
}
