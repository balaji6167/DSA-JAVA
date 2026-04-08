// (leetcode) 3127. Make a Square with the Same Color
// You are given a 2D matrix grid of size 3 x 3 consisting only of characters 'B' and 'W'. Character 'W' represents the white color, and character 'B' represents the black color.
// Your task is to change the color of at most one cell so that the matrix has a 2 x 2 square where all cells are of the same color.

// Return true if it is possible to create a 2 x 2 square of the same color, otherwise, return false.

// Example 1:
// Input: grid = [["B","W","B"],["B","W","W"],["B","W","B"]]

// Output: true

// Explanation:

// It can be done by changing the color of the grid[0][2].

// Example 2:
 
// Input: grid = [["B","W","B"],["W","B","W"],["B","W","B"]]

// Output: false
// Explanation:
// It cannot be done by changing at most one cell.
// Example 3:
 
// Input: grid = [["B","W","B"],["B","W","W"],["B","W","W"]]

// Output: true

// Explanation:

// The grid already contains a 2 x 2 square of the same color.

// Constraints:

// grid.length == 3
// grid[i].length == 3
// grid[i][j] is either 'W' or 'B'.


public class Make_A_Square {
    public boolean canMakeSquare(char[][] grid) {
        return isSquare(grid,0,0) || isSquare(grid,0,1) || isSquare(grid,1,0) || isSquare(grid,1,1);
    }
    private boolean isSquare(char[][] grid,int x,int y){
        int res = 0;
        res += (grid[x][y]==grid[x+1][y])?1:0;
        res += (grid[x][y]==grid[x][y+1])?1:0;
        res += (grid[x][y]==grid[x+1][y+1])?1:0;
        return res!=1;
    }
}