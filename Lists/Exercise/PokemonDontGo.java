package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> distanceToPokemons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (distanceToPokemons.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());

            if (index < 0) {
                int toRemove = distanceToPokemons.get(0);
                //this was swapped with the last index

                sum += distanceToPokemons.get(0);
                distanceToPokemons.set(0, distanceToPokemons.get(distanceToPokemons.size() - 1));

                for (int i = 0; i < distanceToPokemons.size(); i++) {
                    if (distanceToPokemons.get(i) <= toRemove) {
                        int increase = distanceToPokemons.get(i) + toRemove;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, increase);
                    } else if (distanceToPokemons.get(i) > toRemove) {
                        int decrease = distanceToPokemons.get(i) - toRemove;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, decrease);
                    }
                }
            } else if (index >= distanceToPokemons.size()) {
                int valueToReplace = distanceToPokemons.get(distanceToPokemons.size() - 1);

                sum += distanceToPokemons.get(distanceToPokemons.size() - 1);
                distanceToPokemons.set((distanceToPokemons.size() - 1), distanceToPokemons.get(0));

                for (int i = 0; i < distanceToPokemons.size(); i++) {
                    if (distanceToPokemons.get(i) <= valueToReplace) {
                        int increase = distanceToPokemons.get(i) + valueToReplace;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, increase);
                    } else if (distanceToPokemons.get(i) > valueToReplace) {
                        int decrease = distanceToPokemons.get(i) - valueToReplace;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, decrease);
                    }
                }

            } else {
                int indexValue = distanceToPokemons.get(index);
                sum += distanceToPokemons.get(index);
                distanceToPokemons.remove(index);

                for (int i = 0; i < distanceToPokemons.size(); i++) {
                    if (distanceToPokemons.get(i) <= indexValue) {
                        int increase = distanceToPokemons.get(i) + indexValue;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, increase);
                    } else if (distanceToPokemons.get(i) > indexValue) {
                        int decrease = distanceToPokemons.get(i) - indexValue;
                        distanceToPokemons.remove(i);
                        distanceToPokemons.add(i, decrease);
                    }
                }
            }
        }
        System.out.printf("%d", sum);

    }
}
