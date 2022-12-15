//program to convert binary to decimal

import java.util.*;

public class bindeci {
    public static int binde(int n) {
        int k = 0;
        int m = 0;
        while (n > 0) {
            k = k + (n % 10) * ((int) Math.pow(2, m));
            n = n / 10;
            m = m + 1;
        }
        return k;
    }

    public static int debin(int n) {
        int k = 0;
        while (n > 0) {
            k = (k * 10) + (n % 2);
            n = n / 2;
        }
        return k;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = debin(a);
        System.out.println(a);

    }
}
