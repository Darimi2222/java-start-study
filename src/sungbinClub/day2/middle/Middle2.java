package sungbinClub.day2.middle;

public class Middle2 {
    public static void main(String[] args) {
        VariabieExample variabieExample1 = new VariabieExample();

        variabieExample1.addInstanceValue();
        System.out.println("instanceValue = " + variabieExample1.getInstanceValue()); //21

        variabieExample1.addStaticValue();
        System.out.println("staticValue = " + variabieExample1.getStaticValue()); //11

        //새 인스턴스 생성
        VariabieExample variabieExample2 = new VariabieExample();

        System.out.println("instanceValue = " + variabieExample2.getInstanceValue()); //20
        System.out.println("staticValue = " + variabieExample2.getStaticValue()); //11

    }
}