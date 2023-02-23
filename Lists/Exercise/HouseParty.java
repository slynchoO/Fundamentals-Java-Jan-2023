package fundamentals.ListsExerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] personInfo = sc.nextLine().split(" ");

            if (personInfo.length == 3) {
                if (names.contains(personInfo[0])) {
                    System.out.printf("%s is already in the list!%n", personInfo[0]);
                } else {
                    names.add(personInfo[0]);
                }
            }
             else {
                if (!names.contains(personInfo[0])){
                    System.out.printf("%s is not in the list!%n", personInfo[0]);
                } else {
                    names.remove(personInfo[0]);
                }
            }

        }

        for (String name : names
        ) {
            System.out.printf("%s%n", name);
        }
    }
}
