package sungbinClub.day2.middle;

public class VariabieExample {
    public static int staticValue = 10;
    public int instanceValue = 20;

    public void method() {
        int localValue = 30;
        System.out.println(localValue);
    }

    public void addStaticValue(){
        staticValue++;
    }

    public void addInstanceValue(){
        instanceValue++;
    }

    public static int getStaticValue() {
        return staticValue;
    }

    public int getInstanceValue() {
        return instanceValue;
    }
}
