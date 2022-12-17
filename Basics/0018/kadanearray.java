//max subarray by kadane array method

import java.util.*;

public class kadanearray {
    public static void kadane(int arry[]) {
        int cs = 0; // current sum
        int ms = 0; // max sum
        int mex = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            cs = cs + arry[i];
            if (arry[i] > mex) {
                mex = arry[i];
            }
            if (cs > ms) {
                ms = cs;
            }
            if (cs < 0) {
                cs = 0;
            }

        }
        if (ms == 0) {
            ms = mex;
        }
        System.out.println(ms);
    }

    public static void main(String args[]) {
        int arry[] = { -4, -3, -69, -1, -5 };
        kadane(arry);

    }
}
