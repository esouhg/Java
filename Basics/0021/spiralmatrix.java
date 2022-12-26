/*
[ 1  2  3  4
  5  6  7  8
  9  10 11 12
  13 14 15 16 ]
  to
  1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

import java.util.*;

public class spiralmatrix {
    public static void speerul(int[][] metrix) {
        int i = metrix.length - 1;
        int j = metrix[0].length - 1;
        int m = 0;
        for (int n = 0; n <= j; n++) {
            System.out.println(metrix[m][n]);
        }
        int n = j;
        int k = 1;
        while (i > 0 && j > 0) {
            int x = m;
            int y = n;
            if (k == 1) {
                m = m + 1;
                while (m > x && m <= x + i) {
                    System.out.println(metrix[m][n]);
                    m++;
                }
                m = x + i;
                n = n - 1;
                while (n < y && n >= y - j) {
                    System.out.println(metrix[m][n]);
                    n--;
                }
                n = y - j;
            } else {
                m = m - 1;
                while (m < x && m >= x - i) {
                    System.out.println(metrix[m][n]);
                    m--;
                }
                m = x - i;
                n = n + 1;
                while (n > y && n <= y + j) {
                    System.out.println(metrix[m][n]);
                    n++;
                }
                n = y + j;
            }
            if (k == 1) {
                k = 0;
            } else {
                k = 1;
            }
            i--;
            j--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        /*
         * for (int a = 0; a < matrix.length; a++) {
         * for (int b = 0; b < matrix[0].length; b++) {
         * matrix[a][b] = sc.nextInt();
         * }
         * }
         */
        speerul(matrix);
    }

}
