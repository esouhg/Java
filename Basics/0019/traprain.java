//given n non negative integers representing elevations  where width of each bar is 1 compute how much water it can capture after raining
//height if bars given in array form

import java.util.*;

public class traprain {
    public static int[] leftmax(int arry[]) {
        int leftmxarry[] = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            int max = 0;
            if (i == 0) {
                max = 0;

            } else {
                for (int j = 0; j < i; j++) {
                    if (arry[j] > max) {
                        max = arry[j];
                    }
                }
            }
            leftmxarry[i] = max;
        }
        return leftmxarry;
    }

    public static int[] rightmax(int arry[]) {
        int rightmxarry[] = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            int max = 0;
            if (i == arry.length - 1) {
                max = 0;
            } else {
                for (int j = i + 1; j < arry.length; j++) {
                    if (arry[j] > max) {
                        max = arry[j];
                    }
                }
            }
            rightmxarry[i] = max;
        }
        return rightmxarry;
    }

    public static void main(String args[]) {
        int arry[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int wd = 1;
        int[] leftmex = leftmax(arry);
        int[] rightmex = rightmax(arry);
        int wt = 0;
        for (int k = 0; k < arry.length; k++) {
            int wl = Math.min(leftmex[k], rightmex[k]);
            int bh = arry[k];
            int temp = (int) (wl - bh) * wd;
            if (temp < 0) {
                temp = 0;
            }
            wt = wt + temp;

        }
        System.out.println(wt);

    }

}
