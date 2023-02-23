package fundamentals.ListsExerc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");

            switch (tokens[0]) {
                case "Add":
                    //Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
                    if (!input.contains(tokens[1])) {
                        input.add(tokens[1]);
                    }
                    break;
                case "Insert":
                    //Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
                    String lessonTitle = tokens[1];
                    int index = Integer.parseInt(tokens[2]);

                    if (!input.contains(lessonTitle)) {
                        input.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    //Remove:{lessonTitle} - remove the lesson, if it exists
                    if (input.contains(tokens[1])) {
                        input.removeAll(Arrays.asList(tokens[1]));
                    }
                    break;
                case "Swap":
                    //Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
                    if (input.contains(tokens[1]) && input.contains(tokens[2])) {
                        String first = tokens[1];
                        String second = tokens[2];
                        boolean isExercised1 = input.contains(first + "-Exercise");
                        boolean isExercised2 = input.contains(second + "-Exercise");
                        int indexOfFirst = 0;
                        int indexOfSecond = 0;

                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i).equals(first)) {
                                indexOfFirst = i;
                            } else if (input.get(i).equals(second)) {
                                indexOfSecond = i;
                            }
                        }

                        if (isExercised1) {
                            input.set(indexOfFirst, second);
                            input.set(indexOfSecond, first);
                            input.add(indexOfSecond + 1, first + "-Exercise");
                            input.remove(indexOfFirst + 2);
                        } else if (isExercised2) {
                            input.set(indexOfSecond, first);
                            input.set(indexOfFirst, second);
                            input.add(indexOfFirst + 1, second + "-Exercise");
                            input.remove(indexOfSecond + 2);
                        } else {
                            input.set(indexOfSecond, first);
                            input.set(indexOfFirst, second);
                        }
                    }
                    break;
                case "Exercise":
                    //Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if
                    // the lesson exists and there is no exercise already, in the following format
                    // "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the
                    // end of the course schedule, followed by the Exercise.

                    String studyTitle = tokens[1];
                    String exercise = "-Exercise";

                    if (input.contains(studyTitle) && !input.contains(studyTitle+exercise)) {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i).equals(studyTitle)){
                                studyTitle = studyTitle+exercise;
                                input.add(i+1, studyTitle);
                                break;
                            }
                        }
                    } else if (!input.contains(studyTitle)) {
                        input.add(studyTitle);
                        input.add(studyTitle+exercise);
                    }

                    break;
            }

            command = sc.nextLine();
        }
        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%d.%s%n", i+1, input.get(i));
        }

    }
}
