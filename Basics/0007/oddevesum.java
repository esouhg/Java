//program to take inputs from user and find sum of odd, even numbers seperately

import java.util.*;

public class oddevesum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of numbers: ");
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
        System.out.println("Even sum: "+evesum);
        System.out.println("Odd sum: "+oddsum);

    }
}
