import java.util.*;

public class bubsort {
    public static int[] bubesort(int[] arry) { //bubble sort
        //sort by adjacent swapping
        for (int i = 1; i < arry.length; i++) {
            for (int j = 0; j <= arry.length - 2 - i + 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
        return arry;
    }

    public static int[] selsort(int[] arry) { //selection sort
        //pick smallest, place at first
        for (int i = 0; i < arry.length - 1; i++) {
            int min = arry[i];
            int kek = 0;
            for (int j = i; j < arry.length; j++) {
                if (arry[j] < min) {
                    min = arry[j];
                    kek = j;
                }
            }
            int temp = arry[i];
            arry[i] = arry[kek];
            arry[kek] = temp;
        }
        return arry;
    }

    public static int[] insort(int[] arry) {//insertion sort
        //seperate as sorted and unsorted
        //take one from seperated from
        //compare each from unsorted with sorted
        //place it in proper position
        for (int i = 1; i < arry.length; i++) {
            int curr = i;
            int temp = arry[curr];
            int prev = i - 1;
            while (prev >= 0 && arry[prev] > temp) {
                arry[prev + 1] = arry[prev];
                prev--;
            }
            arry[prev + 1] = temp;
        }
        return arry;
    }

    public static void counsort(int[] arry) { //count sort
        //can be used only if the range of numbers is small
        //create count array with numbers as index
        //fill it with frequency of numbers
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arry.length; i++) {
            count[arry[i]] = count[arry[i]] + 1;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arry[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
    }

    public static void main(String args[]) { //inbuilt sort
        int[] arry = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // int[] k =
        Arrays.sort(arry);
        // Arrays.sort(arry, start, end)
        // Arrays.sort(arry, Collections.reverseOrder())
        // Arrays.sort(arry, start, end, Collections.reverseOrder())
        /*
         * for (int i = 0; i < k.length; i++) {
         * System.out.print(k[i]);
         * }
         * System.out.println(k);
         */
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
        System.out.println(arry);

    }
}
