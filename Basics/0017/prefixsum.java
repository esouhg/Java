//program to find max sum of subarray using prefix sum method
public class subaraprefix {
    public static void preffixsum(int arry[]) {
        int arry2[] = new int[arry.length];
        int sumo = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            sumo = sumo + arry[i];
            arry2[i] = sumo;
        }
        for (int j = 0; j < arry.length; j++) {
            for (int k = j + 1; k < arry.length; k++) {
                int sum = j == 0 ? arry2[k] : arry2[k] - arry2[j];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String args[]) {
        int arry[] = { 2, 4, 6, 8, 10 };
        preffixara(arry);

    }
}
