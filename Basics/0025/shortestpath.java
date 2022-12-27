//given path with EWNS ie; directions; return the shortest path with them
import java.util.*;

public class shortestpath {
    public static float ewns(String peth) {
        int count1 = 0;
        int count2 = 0;
        float puth;
        for (int i = 0; i < peth.length(); i++) {
            char c = peth.charAt(i);
            if (c == 'N') {
                count1 = count1 + 1;
            } else if (c == 'S') {
                count1 = count1 - 1;
            } else if (c == 'E') {
                count2 = count2 + 1;
            } else if (c == 'W') {
                count2 = count2 - 1;
            }
        }
        puth = (float) Math.sqrt((count1 * count1) + (count2 * count2));

        return puth;
    }

    public static void main(String args[]) {
        System.out.println(ewns("WNEENESENNN"));
    }

}
