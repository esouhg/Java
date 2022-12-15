import java.util.*;

public class specialnumberpatterns {
    public static void onetwo(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void onetwothree(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i + j > a) {
                    System.out.print(a - j + 1);
                } else {
                    System.out.print(' ');
                }
                System.out.print(' ');
            }
            for (int k = a; k < a + i - 1; k++) {
                System.out.print(k - a + 2);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        onetwothree(5);
    }

}
