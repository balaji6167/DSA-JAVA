// Trapping Rain Water

// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

// Examples:

// Input: arr[] = [3, 0, 1, 0, 4, 0 2]
// Output: 10
// Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

// Input: arr[] = [3, 0, 2, 0, 4]
// Output: 7
// Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.
// Input: arr[] = [1, 2, 3, 4]
// Output: 0
// Explanation: We cannot trap water as there is no height bound on both sides.
// Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
// Output: 9
// Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.
// Constraints:
// 1 < arr.size() < 10^5
// 0 < arr[i] < 10^3

public class Trapping_rain_water {
    public int maxWater(int arr[]) {
        int res = 0;
        int left = 1;
        int right = arr.length-2;
        int lmax = arr[left-1];
        int rmax = arr[right+1];
        while(left<=right){
            if(rmax<=lmax){
                res += Math.max(0,rmax-arr[right]);
                rmax = Math.max(rmax,arr[right]);
                right--;
            }else{
                res += Math.max(0,lmax-arr[left]);
                lmax = Math.max(lmax,arr[left]);
                left++;
            }
        }
        return res;
    }
}