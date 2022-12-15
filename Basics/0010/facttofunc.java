//program to write function for factorial, just for basics of functions
import java.util.*;

public class facttofunc {
    public static int facto(int n) {

        int fect = 1;
        for (int i = 1; i <= n; i = i + 1) {
            fect = fect * i;
        }
        return fect;

    }

}
