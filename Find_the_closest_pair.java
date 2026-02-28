// Find the closest pair from two arrays
// Given two sorted arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.

// Note : In the driver code, the absolute difference between the sum of the closest pair and x is printed.

// Examples:

// Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
// Output : [1, 30]
// Explanation:The closest pair whose sum is closest to 32 is [1, 30] = 31.
// Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 50 
// Output : [7, 40] 
// Explanation: The closest pair whose sum is closest to 50 is [7, 40] = 47.
// Constraints:
// 1 ≤ arr1.size(), arr2.size() ≤ 10^5
// 1 ≤ arr1[i], arr2[i] ≤ 10^9
// 1 ≤ x ≤ 109

import java.util.ArrayList;

public class Find_the_closest_pair {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0;
        int r = arr2.length-1;
        int minDiff = Integer.MAX_VALUE;
        int a = 0,b = 0;
        while(l<arr1.length && r>=0){
            int sum = arr1[l]+arr2[r];
            int diff = Math.abs(sum-x);
            if(diff<minDiff){
                minDiff = diff;
                a = arr1[l];
                b = arr2[r];
            }
            else if(sum>x){
                r--;
            }
            else{
                l++;
            }
        }
        list.add(a);
        list.add(b);
        return list;
    }
}