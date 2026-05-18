// (leetcode) 1089. Duplicate Zeros
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

// Example 1:
// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
// Example 2:

// Input: arr = [1,2,3]
// Output: [1,2,3]
// Explanation: After calling your function, the input array is modified to: [1,2,3]
 
// Constraints:

// 1 <= arr.length <= 10^4
// 0 <= arr[i] <= 9

public class Duplicate_Zeros{
    public void duplicateZeros(int[] arr){
        int zeros = 0;
        for(int num:arr){
            if(num==0){
                zeros++;
            }
        }
        int i = arr.length-1;
        int j = arr.length-1+zeros;
        while(i>=0 && j>=0){
            if(j<n) arr[j] = arr[i];
            if(arr[i]==0){
                j--;
                if(j<n) arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}