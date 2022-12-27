//returns true if the string in palindrome
//second function is better :)

public class palindrome {
    public static boolean pali(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pal1(String a) {
        int x = a.length();
        for (int i = 0; i < x / 2; i++) {
            if (a.charAt(i) != a.charAt(x - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
