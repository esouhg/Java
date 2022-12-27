//converts the first letter of word in string to uppercase
import java.util.*;

public class uppercase {
    public static String ooper(StringBuilder str) {
        /*
         * String str2 = "";
         * for (int i = 0; i < str.length(); i++) {
         * char c = str.charAt(i);
         * if (i == 0 && c != ' ') {
         * c = Character.toUpperCase(c);
         * }
         * str2 = str2 + c;
         * if (c == ' ' && i != str.length() - 1) {
         * i = i + 1;
         * str2 = str2 + Character.toUpperCase(str.charAt(i));
         * }
         * 
         * }
         * return str2;
         */
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && c != ' ') {
                c = Character.toUpperCase(c);
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            if (c == ' ' && i != str.length() - 1) {
                i = i + 1;
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return str.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.print(ooper(str));
    }
}
