package sungbinClub.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExPrintStream {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("output.txt"))) {
            ps.println("result"); // 콘솔이 아니라 output.txt 파일에 기록됨
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
