package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2, 3:
                coupon = 2000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println("coupon = " + coupon);
    }
}
