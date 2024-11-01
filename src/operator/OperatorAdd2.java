package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        b = ++a; //a의 값을 먼저 증가 시킨 후, 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2 , b = 2

        b= a++; //일단 b에 a 값을 대입 후에 a 값을 증가
        System.out.println("a = " + a + ", b = " + b); // a = 3 , b = 2

    }
}
