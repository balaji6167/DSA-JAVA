// Max Xor Subarray of size K
// Given an array of integers arr[]  and a number k. Return the maximum xor of a subarray of size k.

// Note: A subarray is a contiguous part of any given array.

// Examples:

// Input: arr[] = [2, 5, 8, 1, 1, 3], k = 3
// Output: 15
// Explanation: arr[0] ^ arr[1] ^ arr[2] = 15, which is maximum.
// Input: arr[] = [1, 2, 4, 5, 6] , k = 2
// Output: 6
// Explanation: arr[1] ^ arr[2] = 6, which is maximum.
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0 ≤ arr[i] ≤ 10^6
// 1 ≤ k ≤ arr.size()
public class Sol {
    public int maxSubarrayXOR(int[] arr, int k) {
        int l = 0;
        int xor = 0;
        int maxi = 0;
        for(int r=0;r<arr.length;r++){
            xor = arr[r]^xor;
            if(r-l+1>k){
                xor = arr[l]^xor;
                l++;
            }
            if(r-l+1==k){
                maxi = Math.max(maxi,xor);
            }
        }
        return maxi;
    }
}