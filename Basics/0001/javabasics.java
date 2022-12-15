//random java program covering basics like print, input, operations, variable initializations
//program commented out: calculate area of circle by getting radius from user

import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        System.out.print("a = ");
        Scanner sc = new Scanner(System.in); // once is enough
        int x = sc.nextInt();
        System.out.print("b = ");
        int y = sc.nextInt();
        int c = 69;
        int d = x + y + c - 69;
        int e = x * y;
        String name = "Lmao dead";
        System.out.println(d);
        System.out.println(sc);
        System.out.println(x);
        System.out.println(y);
        System.out.println(e);
        System.out.print(name);
        /*
         * for area of circle
         * Scanner sc = new Scanner(Systerm.in);
         * float rad = sc.nextFloat();
         * float area = 3.14 * rad * rad
         * this will give error cuz java by default assumes decimals as double
         * 3.14(double) * rad(float) * rad(float) = error cuz different data type
         * hence 3.14 = 3.14f
         * Scanner sc = new Scanner(Systerm.in);
         * float rad = sc.nextFloat();
         * float area = 3.14f * rad * rad
         */
    }
}
