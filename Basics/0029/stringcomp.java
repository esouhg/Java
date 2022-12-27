//stringcompression
//aaabbccccdd => a3b2c4d2

import java.util.*;

public class stringcomp {
    public static String comp(StringBuilder str) {
        StringBuilder str2 = new StringBuilder();
        int i = 0;
        while (str.toString() != "") {
            int cnt = 1;
            char st = str.charAt(i);
            int j = i + 1;
            while (j < str.length()) {
                if (st != str.charAt(j)) {
                    j++;
                } else {
                    str.deleteCharAt(j);
                    cnt = cnt + 1;
                }
            }
            str2.append(st);
            if (cnt != 1) {
                str2.append(cnt);
            }
            str.deleteCharAt(i);
        }
        return str2.toString();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.print(comp(str));
    }

}
