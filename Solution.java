// Longest subarray with Atmost two distinct integers
// Given an array arr[] consisting of positive integers, your task is to find the length of the longest subarray that contains at most two distinct integers.

// Examples:

// Input: arr[] = [2, 1, 2]
// Output: 3
// Explanation: The entire array [2, 1, 2] contains at most two distinct integers (2 and 1). Hence, the length of the longest subarray is 3.
// Input: arr[] = [3, 1, 2, 2, 2, 2]
// Output: 5
// Explanation: The longest subarray containing at most two distinct integers is [1, 2, 2, 2, 2], which has a length of 5.
// Constraints:
// 1 ≤ arr.size() ≤ 10^5
// 1 ≤ arr[i] ≤ 10^5

import java.util.HashMap;
public class Solution {
    public int totalElements(int[] arr) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        int l = 0;
        int maxi = 0;
        for(int r=0;r<arr.length;r++){
            Map.put(arr[r],Map.getOrDefault(arr[r],0)+1);
            while(Map.size()>2){
                Map.put(arr[l],Map.get(arr[l])-1);
                if(Map.get(arr[l])==0){
                    Map.remove(arr[l]);
                }
                l++;
            }
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}