package sungbinClub.day3.advanced;

import java.util.Scanner;

public class Advanced2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > 0 && number2 < 0) {
            int result = number1 * number2;
            System.out.println(number1 + " * (" + number2 + ") = " + result);
        } else {
            System.out.println("첫 번째 수가 양수, 두 번째 수가 음수이어야 합니다.");
        }
    }
}
