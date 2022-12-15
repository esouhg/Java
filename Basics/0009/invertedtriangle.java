//program to print inverted triangle pattern with *
import java.util.*;
public class invertedtriangle {
    
    public static void main(String args[]) {
        String x = "*";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= i; j = j + 1) {
                System.out.print(x);
            }
            System.out.println();
        }
}
}
