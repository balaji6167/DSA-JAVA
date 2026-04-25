// (leetcode) 1317. Convert Integer to the Sum of Two No-Zero Integers

// No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

// Given an integer n, return a list of two integers [a, b] where:

// a and b are No-Zero integers.
// a + b = n
// The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.

// Example 1:
// Input: n = 2
// Output: [1,1]
// Explanation: Let a = 1 and b = 1.
// Both a and b are no-zero integers, and a + b = 2 = n.

// Example 2:
// Input: n = 11
// Output: [2,9]
// Explanation: Let a = 2 and b = 9.
// Both a and b are no-zero integers, and a + b = 11 = n.
// Note that there are other valid answers as [8, 3] that can be accepted.
 

// Constraints:

// 2 <= n <= 10^4

public class ConvertIntegerSum {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int l = 1;
        int r = n-1;
        while(l<=r){
            if(noZeros1(l) && noZeros2(r) && l+r==n){
                arr[0] = l;
                arr[1] = r;
                break;
            }
            l++;
            r--;
        }
        return arr;
    }
    private boolean noZeros1(int n){
        String str = String.valueOf(n);
        for(char c:str.toCharArray()){
            if(c=='0'){
                return false;
            }
        }
        return true;
    }
    private boolean noZeros2(int n){
        String str = String.valueOf(n);
        for(char c:str.toCharArray()){
            if(c=='0'){
                return false;
            }
        }
        return true;
    }
} 