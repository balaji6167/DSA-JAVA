// (LeetCode): 59. Spiral Matrix II:

// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Example 1:

// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]

// Example 2:

// Input: n = 1
// Output: [[1]]
// Constraints:
// 1 <= n <= 20

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int value = 1;
        int end = n*n;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int[][] matrix = new int[n][n];
        while (value<=end) {
            for (int i = left; value<=end && i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; value<=end && i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            for (int i = right; value<=end && i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; value<=end && i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }       
        return matrix; 
    }
}