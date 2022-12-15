//just more functions

import java.util.*;

public class morefunction {
    public static float assavg(int a, int b, int c) {
        float k = (float) (a + b + c) / 3;
        return k;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;

    }

    public static boolean asspalindrome(int a) {
        int k = 0;
        int n = a;
        while (n > 0) {
            k = k * 10 + n % 10;
            n = n / 10;
        }
        if (k == a) {
            return true;
        } else {
            return false;
        }
    }

    public static int assdigitsum(int a) {
        int k = 0;
        while (a > 0) {
            k = k + a % 10;
            a = a / 10;
        }
        return k;
    }

    public static void main(String args[]) {
        System.out.println(assdigitsum(321));
    }

}
