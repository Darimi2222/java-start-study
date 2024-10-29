package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수형
        byte b = 127; //-128 ~ 128
        short s = 32767; //-32,768 ~ 32,767
        int i = 2147483647; //4바이트
        long l = 920000000000000000L; //8바이트

        //실수형
        float f = 10.0f; //4바이트
        double d = 10.0; //8바이트

        //boolean, char 은 1바이트
        //String은 문자 길이에 따라 동적으로 달라진다.
    }
}
