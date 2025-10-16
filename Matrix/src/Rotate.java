import java.util.Arrays;

public class Rotate {
    public static int[][] rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] res=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n-i-1]=matrix[i][j];
            }
        }
        for (int m = 0; m < n; m++) {
            for (int s = 0; s < n; s++) {
                matrix[m][s]=res[m][s];
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=rotate(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
}
