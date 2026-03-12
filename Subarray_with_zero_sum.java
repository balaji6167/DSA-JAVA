// Subarray with 0 sum

// Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum. Return true/false depending upon whether there is a subarray present with 0-sum or not. 

// Examples:

// Input: arr[] = [4, 2, -3, 1, 6]
// Output: true
// Explanation: 2, -3, 1 is the subarray with a sum of 0.
// Input: arr = [4, 2, 0, 1, 6]
// Output: true
// Explanation: 0 is one of the element in the array so there exist a subarray with sum 0.
// Input: arr = [1, 2, -1]
// Output: false
// Constraints:
// 1 <= arr.size <= 10^5
// -105 <= arr[i] <= 10^5

import java.util.HashMap;
public class Subarray_with_zero_sum {
    static boolean findsum(int arr[]) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        int prefixSum = 0;
        Map.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(Map.containsKey(prefixSum)){
                return true;
            }
            Map.put(prefixSum,Map.getOrDefault(prefixSum,0)+1);
        }
        return false;
    }   
}