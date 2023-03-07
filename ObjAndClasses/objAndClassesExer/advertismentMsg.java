package fundamentals.objAndClassesExer;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] authors = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        String[] cities = {"Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };
        Random rnd = new Random();


        for (int i = 0; i < n; i++) {
            //"{phrase} {event} {author} – {city}".
            int phraseRnd = rnd.nextInt(phrases.length);
            int eventRnd = rnd.nextInt(events.length);
            int authorRnd = rnd.nextInt(authors.length);
            int cityRnd = rnd.nextInt(cities.length);

            System.out.println(String.join(" ", phrases[phraseRnd] + " " + events[eventRnd]) +
                    " " + authors[authorRnd] + "-" + cities[cityRnd]);


        }

    }
}
