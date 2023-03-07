package fundamentals.objAndClassesExer.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String articleData = sc.nextLine();
        String[] articleArr = articleData.split(", ");
        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.contains("Edit")) {
                article.setContent(command.split(": ")[1]);
            } else if (command.contains("ChangeAuthor")) {
                article.setAuthor(command.split(": ")[1]);
            } else if (command.contains("Rename")) {
                article.setTitle(command.split(": ")[1]);
            }
        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());

    }
}
