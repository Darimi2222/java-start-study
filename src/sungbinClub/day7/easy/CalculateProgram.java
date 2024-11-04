package sungbinClub.day7.easy;

import java.util.Scanner;

public class CalculateProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요.");
        double firstNumber = scanner.nextDouble();

        System.out.println("두 번째 수를 입력하세요.");
        double secondNumber = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("연산자를 입력하세요. (+, -, *, /)");
        char operator = scanner.nextLine().charAt(0);

        double result = switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber == 0){
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }

                yield  firstNumber / secondNumber;
            }
            default -> throw new IllegalArgumentException("잘못된 연산자의 입력입니다.");
        };

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

    }
}
