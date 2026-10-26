// (Leetcode): 4000. Largest Integer With Given Digit Sum:

// You are given two non-negative integers n and s.
// Return the largest integer that has at most n digits and whose sum of digits is s. If no such integer exists, return -1.

// Example 1:

// Input: n = 2, s = 9
// Output: 90
// Explanation:
// The largest integer with at most 2 digits that has a sum of digits of 9 is 90.

// Example 2:

// Input: n = 2, s = 19
// Output: -1
// Explanation:
// There is no integer with at most 2 digits that has a sum of digits of 19, so the answer is -1.

// Example 3:

// Input: n = 5, s = 0
// Output: 0
// Explanation:
// The only non-negative integer whose digits sum to 0 is 0.

// Constraints:
// 1 <= n <= 5
// 0 <= s <= 100

public class LargestIntegerDigitSum{
    public int largestInteger(int n, int s) {
        if(n==1 && (s>=1 && s<=9)){
            return s;
        }
        if(s==0){
            return 0;
        }
        int prod = 1;
        int temp = n;
        while(temp-->0){
            prod *= 10;
        }
        int low = prod/10;
        prod = prod-1;
        while(prod>=low){
            int value = sumOfDigits(prod);
            if(value==s){
                return prod;
            }
            prod--;
        }
        return -1;
    }
    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}