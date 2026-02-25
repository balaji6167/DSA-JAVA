// Two sum -Pairs with 0 Sum
// Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.

// Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

// Examples:

// Input: arr = [-1, 0, 1, 2, -1, -4]
// Output: [[-1, 1]]
// Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
// arr[2] + arr[4] = 1 + (-1) = 0.
// The distinct pair are [-1,1].
// Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
// Output: [[-6, 6],[-1, 1]]
// Explanation: The distinct pairs are [-1, 1] and [-6, 6].
// Expected Time Complexity: O(n log n)
// Expected Auxiliary Space: O(n).

// Constraints:
// 3 <= arr.size <= 10^5
// -105 <= arr[i] <= 10^5

import java.util.ArrayList;
import java.util.Arrays;

public class Two_sum_with_zero {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==0){
                ArrayList<Integer> newPair = new ArrayList<>(Arrays.asList(arr[l], arr[r])); 
                result.add(newPair); 
                l++;
                r--;
                while(l<r && arr[l]==arr[l-1]) l++;
                while(l<r && arr[r]==arr[r+1]) r--;
            }
            else if(sum<0){
                l++;
            }
            else{
                r--;
            }
        }
        return result;
    }
}