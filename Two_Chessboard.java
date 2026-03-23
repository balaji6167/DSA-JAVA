// leetcode 3274. Check if Two Chessboard Squares Have the Same Color

// You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.
// Below is the chessboard for reference.
// Return true if these two squares have the same color and false otherwise.

// The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).

// Example 1:
// Input: coordinate1 = "a1", coordinate2 = "c3"
// Output: true

// Example 2:
// Input: coordinate1 = "a1", coordinate2 = "h3"
// Output: false

// Constraints:

// coordinate1.length == coordinate2.length == 2
// 'a' <= coordinate1[0], coordinate2[0] <= 'h'
// '1' <= coordinate1[1], coordinate2[1] <= '8'

public class Two_Chessboard {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char e = coordinate1.charAt(0),f = coordinate1.charAt(1),g = coordinate2.charAt(0),h = coordinate2.charAt(1);
        if(((e-'a')+(f-'0'))%2==0 && ((g-'a')+(h-'0'))%2==0  || ((e-'a')+(f-'0'))%2==1 && ((g-'a')+(h-'0'))%2==1){
            return true;
        }
        return false;
    }
}