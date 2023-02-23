package fundamentals.midExam;

import java.util.Scanner;

public class cookingMasterclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double priceForOnePackFlour = Double.parseDouble(sc.nextLine());
        double priceForOneEgg = Double.parseDouble(sc.nextLine());
        double priceForOneApron = Double.parseDouble(sc.nextLine());

        // every fifth pack of flour is free
        // buy 20% more apron rounded up to next int;
        int packsFlour = (int) Math.ceil((double) students / 5);
        int totalPacksFlour = students + packsFlour;
        double totalPriceFlour = priceForOnePackFlour * totalPacksFlour;

        double totalPriceEggs = (priceForOneEgg * 10) * students;
        double moreAprons = Math.ceil(students * 0.2);

        double totalForAprons = priceForOneApron * (students + (int) moreAprons);

        double total = totalForAprons + totalPriceEggs + totalPriceFlour;

        if (total <= budget) {
            System.out.printf("Items purchased for %.2f$.", total);
        } else {
            System.out.printf("%.2f$ more needed.", total - budget);
        }
    }

}
