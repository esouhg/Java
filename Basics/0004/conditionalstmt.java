//program to find greatest of three user input numbers
//program commented out: get age from user and say whether they are adult child teenager or baby
import java.util.*;

public class conditionalstmt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * int x = sc.nextInt();
         * if (x>=18){
         * System.out.println("Adult");
         * }
         * if (x<18 && x>=13){
         * System.out.println("teenager");
         * }
         * if (x>=0 && x<2){
         * System.out.println("Baby");
         * }
         * else{
         * System.out.println("Child");
         * }
         */
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(a);
        } else if ((b > c) && (b > a)) {
            System.out.println(b);
        } else if ((c > b) && (c > a)) {
            System.out.println(c);
        }
    }
}
