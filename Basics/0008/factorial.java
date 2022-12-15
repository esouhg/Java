import java.util.*;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= x; i = i + 1) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
