// Column Sum in a Matrix
// Given a 2-D integer matrix mat[][] of size n*m. Return a list of integers where list[i] represents the sum of elements of the ith column of the matrix.

// Examples:

// Input: mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Output: [12, 15, 18]
// Explanation: Column 1 -> 1+4+7=12, Column 2 -> 2+5+8=15, Column 3 -> 3+6+9=18 
// Input: mat = [[1, 2], [10, 2], [3, 3]]
// Output: [14, 7]
// Explanation: Column 1 -> 1+10+3=14, Column 2 -> 2+2+3=7 
// Constraints:
// 1  <=  n, m  <=  1000

public class Column_Sum {
    public static int[] colSum(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[n];
        for(int i=0;i<m;i++){
            int index = 0;
            for(int j=0;j<n;j++){
                arr[index++] += mat[i][j];
            }
            index = 0;
        }
        return arr;
    }
}