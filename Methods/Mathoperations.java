package fundamentals.methodsLab;

import java.util.Scanner;

public class Mathoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secondNum = Integer.parseInt(sc.nextLine());

        System.out.printf("%.0f", calculate(firstNum,operator,secondNum));

    }

    public static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0.00;

        switch (operator) {
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
        }

        return result;
    }
}
