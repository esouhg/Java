//program to reverse user input number

import java.util.*;

public class reversenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
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
