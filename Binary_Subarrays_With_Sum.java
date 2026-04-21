// (leetcode) 930. Binary Subarrays With Sum

// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
// A subarray is a contiguous part of the array.


// Example 1:

// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]

// Example 2:

// Input: nums = [0,0,0,0,0], goal = 0
// Output: 15
 

// Constraints:

// 1 <= nums.length <= 3 * 10^4
// nums[i] is either 0 or 1.
// 0 <= goal <= nums.length

import java.util.HashMap;
public class Binary_Subarrays_With_Sum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int presum= 0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            if(map.containsKey(presum-goal)){
                count += map.get(presum-goal);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}