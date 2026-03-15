// Number of subsets with product less than k
// Given an array arr. Find the number of non-empty subsets whose product of elements is less than or equal to a given integer k.

// Examples:

// Input: arr[] = [2, 4, 5, 3], k = 12
// Output: 8
// Explanation: All possible subsets whose products are less than 12 are: (2), (4), (5), (3), (2, 4), (2, 5), (2, 3), (4, 3).
// Input: arr[] = [9, 8, 3], k = 2 
// Output: 0
// Explanation: There is no subsets with product less than or equal to 2.
// Input: arr[] = [9, 2, 2], k = 2 
// Output: 2
// Explanation: All possible subsets whose products are less than 12 are: (2), (2).
// Constraints:
// 1 ≤ arr.size() ≤ 30
// 1 ≤ arr[i] ≤ 10
// 1 ≤ k ≤ 10^6

public class Number_of_subsets_with_product_less_than_k {
    int count = 0;
    public int numOfSubsets(int[] arr, int k) {
        recursion(arr,k,0,1);
        return count;
    }
    void recursion(int[] arr,int k,int index,int product){
        for(int i=index;i<arr.length;i++){
            int newproduct = product*arr[i];
            if(newproduct<=k){
                count++;
                recursion(arr,k,i+1,newproduct);
            }
        }
    }   
}