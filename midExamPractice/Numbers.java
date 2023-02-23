package fundamentals.midExamPractive;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double avg = sum / numbers.size();
        Collections.reverse(numbers);

        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > avg) {
                count++;
                System.out.printf("%d ", numbers.get(i));
            } else if (i == numbers.size() - 1 && count == 0) {
                System.out.println("No");
            }
            if (count == 5) {
                break;
            }
        }
    }
}
