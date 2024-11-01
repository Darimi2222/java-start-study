package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2); //틀린 방식!

        System.out.println(str1.equals(str2));
    }
}
