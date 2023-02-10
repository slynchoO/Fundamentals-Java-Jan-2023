package fundamentals.BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        while (num%2!=0){
            System.out.println("Please write an even number.");
            num = sc.nextInt();
        }
        System.out.printf("The number is: %d",Math.abs(num));
    }

}
