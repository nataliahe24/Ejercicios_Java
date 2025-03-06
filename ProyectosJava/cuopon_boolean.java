import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean isActive= false;
        boolean isPremium = true;
        boolean isOn= true;

        String coupon = "coupon_788";
        boolean promo = coupon.equals("coupon_111") || coupon.equals("coupon_788");
        System.out.println(promo);

        boolean hasFunds = true;

        boolean canPuchase = isAdult && isActive && hasFunds;
        System.out.println(canPuchase);

    }
}