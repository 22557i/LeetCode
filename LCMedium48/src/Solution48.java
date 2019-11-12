/**
 * Created by Hao Wu on 10/15/19.
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (1+n)/2; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
