import java.util.*;

public class reversenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * float x = sc.nextFloat();
         * float n = 0;
         * for (float i = 10; i <= x * 10; i = i * 10) {
         * float t = (float) n * 10;
         * float r = (float) (x % i);
         * float u = (float) (x % (i / 10));
         * float v = (float) r - u;
         * float w = (float) v * (10 / i);
         * n = (float) (t + w);
         * }
         * int k = (int) n;
         * System.out.println(k);
         */
        int x = sc.nextInt();
        float n = 0;
        while (x > 0) {
            n = n * 10 + (x % 10);
            x = (int) x / 10;
        }
        int k = (int) n;
        System.out.println(k);
    }
}
