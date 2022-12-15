//program to create a basic calculator using switch case

import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int s = sc.nextInt();
        switch(s){
            case 1: System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
                break;
            case 4: System.out.println(a/b);
                break;
            case 5: System.out.println(a%b);
                break;
            default: System.out.println("no");
            }
            
        }
    }
