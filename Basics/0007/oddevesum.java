import java.util.*;

public class oddevesum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evesum = 0;
        int oddsum = 0;
        for (int i = 1; i <= n; i = i + 1) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                evesum = evesum + x;
            } else {
                oddsum = oddsum + x;
            }
        }
        System.out.println(evesum);
        System.out.println(oddsum);

    }
}
