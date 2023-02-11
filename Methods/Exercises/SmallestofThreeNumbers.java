package fundamentals.methodsExe;

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());

        System.out.println(compare(firstNum,secondNum,thirdNum));

    }

    public static int compare(int firstNum, int secondNum, int thirdNum)  {
        int result = 0;

        if (firstNum < secondNum && firstNum < thirdNum) {
            result = firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            result = secondNum;
        } else {
            result = thirdNum;
        }

        return result;
    }
}
