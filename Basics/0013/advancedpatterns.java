//more patterns
//hollow rectangle
//inverted pyramid
//floyd's triangle
//0 1 triangle
//butterfly
//rhombus
//hollow rhombus

import java.util.*;

public class hollorect {
    public static void hollorekt(int l, int b) {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= b; j++) {
                if ((i == 1) || (i == l) || (j == 1) || (j == b)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }

    }

    public static void invpyramid(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i + j > a) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void floyd(int a) {
        int k = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                System.out.print(' ');
                k = k + 1;
            }
            System.out.println();
        }
    }

    public static void zeroone(int a) {
        for (int i = 1; i <= a; i++) {
            int k = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                System.out.print(' ');
                if (k == 0) {
                    k = 1;
                } else {
                    k = 0;
                }
            }
            System.out.println();
        }
    }

    public static void flutterby(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 2 * a; j++) {
                if ((j <= i) || (i + j > 2 * a)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        for (int i = a + 1; i <= 2 * a; i++) {
            for (int j = 1; j <= 2 * a; j++) {
                if ((j <= (2 * a + 1 - i)) || ((2 * a + 1 - i + j) > 2 * a)) {
                    System.out.print('*');

                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void solrhombus(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 2 * a + 1 - i; j++) {
                if (j > a - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void holrhombus(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 2 * a + 1 - i; j++) {
                if (((i == 1) && (j > a - i)) || (i == a) || (j == a - i + 1) || (j == 2 * a + 1 - i)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        holrhombus(5);
    }

}
