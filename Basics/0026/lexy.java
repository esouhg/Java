//returns lexicographically largest element in array
public class lexy {
    public static String lexu(String[] arry) {
        String large = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if ((arry[i].compareTo(large)) > 0) {
                large = arry[i];
            }
        }
        return large;
    }
}
