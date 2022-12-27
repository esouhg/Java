//search in sorted matrix using this staircase algorithmn
//this algorithmn uses the fact that the matrix is sorted to move downwards/right 

public class staircase {
    public static void steps(int[][] metrix, int key) {
        int i = 0;
        int j = metrix[0].length - 1;
        while (metrix[i][j] != key) {
            if (metrix[i][j] > key) {
                j = j - 1;
            } else if (metrix[i][j] < key) {
                i = i + 1;
            }
        }
        System.out.print(i);
        System.out.print(" ");
        System.out.print(j);
    }

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        steps(matrix, 9);
    }

}
