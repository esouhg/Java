//program to calculate average of 3 numbers, total of them and with 18% tax
//program in quotes: calculate area of square by taking input from user.

import java.util.*;

public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("first number= ");
        float x = sc.nextFloat();
        System.out.print("second number= ");
        float y = sc.nextFloat();
        System.out.print("third number= ");
        float z = sc.nextFloat();
        float avg = (x+y+z)/3;
        float total = x+y+z;
        float grndttl = total*(1.18f);
        System.out.println("total is: " + total);
        System.out.println("Grand total is: " + grndttl);
        System.out.println("Average is: " + avg);
        System.out.println("Side tell: ");
//         float s =sc.nextFloat();
//         float a = s*s;
//         System.out.println("Area is: " + a);
    }
}
