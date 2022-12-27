
public class substring {
    public static String sub(String str, int strt, int end) {
        String qw = "";
        for (int i = strt; i < end; i++) {
            qw = qw + str.charAt(i);
        }
        return qw;
    }

    public static void main(String args[]) {
        System.out.println(sub("String", 2, 5));
        // str.substring(strt, end); gives the same
    }

}
