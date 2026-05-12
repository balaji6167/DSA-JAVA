// (Leetcode): 118. Pascal's Triangle

// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Example 2:

// Input: numRows = 1
// Output: [[1]]

// Constraints:
// 1 <= numRows <= 30


import java.util.ArrayList;
import java.util.List;
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> GenerateList = new ArrayList<>();
        for(int row=0;row<numRows;row++){
            GenerateList.add(addList(row));
        }
        return GenerateList;
    }
    public List<Integer> addList(int row){
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add(1);
        for(int i=1;i<=row;i++){
            ans = ans*(row-i+1);
            ans = ans/i;
            list.add((int)ans);
        }
        return list;
    }
}