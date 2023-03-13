package fundamentals.assocArraysExer;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, List<Double>> diary = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if (!diary.containsKey(name)) {
                diary.put(name, new ArrayList<>());
                diary.get(name).add(grade);
            } else {
                diary.get(name).add(grade);
            }

        }

        LinkedHashMap<String, Double> toKeep = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : diary.entrySet()) {
            double sum = getAverage(entry.getValue());
            if (sum >= 4.50) {
                toKeep.put(entry.getKey(), sum);
            }
        }

        toKeep.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value ));


    }

    private static double getAverage(List<Double> value) {
        double sum = 0;
        for (int i = 0; i < value.size(); i++) {
            sum += value.get(i);
        }

        return sum / value.size();
    }
}
