package sungbinClub.day7.middle;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        String[] quizArray = {"1 + 3 = ", "3 * 3 = ", "6 - 2 = ", "2 - 3 * 3 = ", "(2 + 2) * 3 - 1 = "};
        int[] answerArray = {4, 9, 4, -7, 11};

        char[] checkUserAnswer = new char[5];
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for(int quizNumber = 1 ; quizNumber <= quizArray.length ; quizNumber++){
            System.out.print(quizArray[quizNumber-1]);
            int userAnswer = scanner.nextInt();

            if(answerArray[quizNumber - 1] == userAnswer){
                checkUserAnswer[quizNumber -1] = '○';
                score ++;
            } else {
                checkUserAnswer[quizNumber -1] = 'X';
            }
        }

        System.out.println("총 점수: "+score);

        for (char checkAnswer : checkUserAnswer){
            System.out.printf("%2s", checkAnswer);
        }
    }
}
