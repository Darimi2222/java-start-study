package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("!: 부정 연산");
        System.out.println(!true);
        System.out.println(!false);
    }
}
