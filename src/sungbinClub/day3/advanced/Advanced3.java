package sungbinClub.day3.advanced;

public class Advanced3 {
    public static void main(String[] args) {
        int[] intArray = {-10, 4, -4, 6, 0, 2, -4, 6, 7, 10};

        int sum = 0;

        for (int number : intArray) {
            if (number % 2 != 0) {
                break;
            }
            if (number % 2 == 0 && number > 0) {
                sum += number;
            }
        }

        System.out.println("sum = " + sum);
    }
}
