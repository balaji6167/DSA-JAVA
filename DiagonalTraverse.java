// leetcode 498. Diagonal Traverse:

// Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

 

// Example 1:


// Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,4,7,5,3,6,8,9]
// Example 2:

// Input: mat = [[1,2],[3,4]]
// Output: [1,2,3,4]
 

// Constraints:

// m == mat.length
// n == mat[i].length
// 1 <= m, n <= 10^4
// 1 <= m * n <= 10^4
// -10^5 <= mat[i][j] <= 10^5
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if(m==0 || n==0) return new int[0];
        int[] ans = new int[n*m];
        boolean up = true;
        int i = 0,row = 0,col = 0;
        while(row<m && col<n){
            if(up){
                while(row>0 && col<n-1){
                    ans[i++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[i++] = mat[row][col];
                if(col==n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            else{
                while(col>0 && row<m-1){
                    ans[i++] = mat[row][col];
                    row++;
                    col--;
                }
                ans[i++] = mat[row][col];
                if(row==m-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            up = !up;
        }
        return ans;
    }
}