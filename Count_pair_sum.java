// Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum equals x.

// Examples:

// Input: x = 10, arr1[] = [1, 3, 5, 7], arr2[] = [2, 3, 5, 8] 
// Output: 2
// Explanation: The pairs are: (5, 5) and (7, 3).  
// Input: x = 5, arr1[] = [1, 2, 3, 4], arr2[] = [5, 6, 7, 8]
// Output: 0
// Explanation: There are no valid pairs.
// Expected Time Complexity: O(n+m).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ x ≤ 109
// 1 ≤ arr1.size(), arr2.size() ≤ 10^6
// 1 ≤ arr1[i], arr2[i] ≤ 10^6

public class Count_pair_sum{
    static int countPairs(int arr1[], int arr2[], int x) {
        
        // code here.
        int i = 0;
        int j = arr2.length - 1;
        int count = 0;

        while(i < arr1.length && j >= 0){
            int sum = arr1[i] + arr2[j];
            
            if(sum == x){
                count++;
                i++;
                j--;
            }
            else if(sum < x){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}