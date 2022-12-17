import java.util.*;

public class subarrays {
    public static void subray(int arry[]) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arry[k];
                    System.out.print(arry[k]);
                    System.out.print(' ');
                }
                if (sum > max_sum) {
                    max_sum = sum;
                } else if (sum < min_sum) {
                    min_sum = sum;
                }
                System.out.println();
                System.out.println(sum);

            }
        }
        System.out.println(max_sum);
        System.out.println(min_sum);
    }

    public static void main(String args[]) {
        int arry[] = { 2, 4, 6, 8, 10 };
        subray(arry);
    }

}
