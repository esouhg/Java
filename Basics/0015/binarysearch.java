import java.util.*;

public class binarysearch {
    public static int binsearch(int arry[], int key) {
        int start = 0;
        int end = arry.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arry[mid]) {
                return mid;
            } else if (key < mid) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int arry[] = new int[no];
        for (int i = 0; i < no; i++) {
            System.out.print("Enter the " + i + "th char");
            arry[i] = sc.nextInt();
        }
        System.out.print("key");
        int key = sc.nextInt();
        System.out.print("index is " + binsearch(arry, key));
    }
}
