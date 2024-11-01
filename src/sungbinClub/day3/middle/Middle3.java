package sungbinClub.day3.middle;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int score = scanner.nextInt();

        if(age >= 18 && score >= 70){
            System.out.println("합격");
        }

    }
}
