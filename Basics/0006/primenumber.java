import java.util.*;

//Math and Scanner part of java.util
public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x == 2) || (x == 3)) {
            System.out.println("prime");
        } else {
            for (int n = 2; n <= (int) Math.sqrt(x); n = n + 1) {
                if (x % n == 0) {
                    System.out.println("not prime");
                    break;
                } else if (n == (int) Math.sqrt(x)) {
                    System.out.println("prime");
                }

            }
        }
    }
}
