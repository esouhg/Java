//returns transpose of the matrix
public class transpose {
    public static int[][] trens(int[][] metrix) {
        int x = metrix[0].length;
        int y = metrix.length;
        int[][] mutrix = new int[x][y];
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                mutrix[j][i] = metrix[i][j];
            }
        }
        return mutrix;
    }

}
