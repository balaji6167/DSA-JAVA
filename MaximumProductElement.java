// (Leetcode): 628. Maximum Product of Three Numbers:
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
// Example 1:

// Input: nums = [1,2,3]
// Output: 6

// Example 2:

// Input: nums = [1,2,3,4]
// Output: 24

// Example 3:

// Input: nums = [-1,-2,-3]
// Output: -6
 
// Constraints:
// 3 <= nums.length <= 10^4
// -1000 <= nums[i] <= 1000

import java.util.Arrays;
public class MaximumProductElement{
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int product1=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(product,product1);
    }  
}