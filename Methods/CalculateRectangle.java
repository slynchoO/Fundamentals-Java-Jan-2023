package fundamentals.methodsLab;

import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        double area = calcArea(width, height);
        System.out.printf("%.0f", area);
    }

    public static double calcArea(double width, double height) {
        return width * height;
    }
}
