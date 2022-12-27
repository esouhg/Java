//returns true if the string is anagram
import java.util.*;

public class anagram {
    public static boolean anal(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        } else {
            char[] strry = str.toCharArray();
            char[] strry2 = str2.toCharArray();
            Arrays.sort(strry);
            Arrays.sort(strry2);
            return Arrays.equals(strry, strry2);
        }
    }
}
