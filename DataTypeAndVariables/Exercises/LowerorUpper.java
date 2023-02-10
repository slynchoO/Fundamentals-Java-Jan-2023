    package fundamentals.DataTypesandVariables;

    import java.util.Scanner;

    public class LowerorUpper {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String letter = sc.nextLine();

            if (letter.equals(letter.toLowerCase())) {
                System.out.println("lower-case");
            } else {
                System.out.println("upper-case");
            }

        }
    }
