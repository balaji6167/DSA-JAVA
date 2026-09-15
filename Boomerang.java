// (Leetcode) 1037. Valid Boomerang:

// Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
// A boomerang is a set of three points that are all distinct and not in a straight line.

// Example 1:

// Input: points = [[1,1],[2,3],[3,2]]
// Output: true

// Example 2:

// Input: points = [[1,1],[2,2],[3,3]]
// Output: false
 
// Constraints:
// points.length == 3
// points[i].length == 2
// 0 <= xi, yi <= 100

public class Boomerang{
    public boolean isBoomerang(int[][] points) {
        int dx1 = points[1][0]-points[0][0];
        int dy1 = points[1][1]-points[0][1];
        int dx2 = points[2][0]-points[1][0];
        int dy2 = points[2][1]-points[1][1];
        return dy1*dx2 != dx1*dy2;
    }
}