package cond.ex;

public class CondEx5 {
    public static void main(String[] args) {
        int x = 7;

        String evenOrOdd = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x는 " + evenOrOdd + "입니다.");
    }
}
