// (LeetCode) : 556. Next Greater Element III:

// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.
// Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

// Example 1:

// Input: n = 12
// Output: 21

// Example 2:

// Input: n = 21
// Output: -1
 
// Constraints:
// 1 <= n <= 2^31 - 1



public class GreaterElementIII {
    public int nextGreaterElement(int n) {
        long m = n;
        int[] count = new int[10];
        int prevRem = -1;
        int currRem = -1;
        while(m>0){
            currRem = (int)m%10;
            m /= 10;
            count[currRem]++;
            if(prevRem>currRem){
                int num = currRem+1;
                while(count[num]==0) num++;
                count[num]--;
                m = m*10+num;
                for(int i=0;i<count.length;i++){
                    while(count[i]-- > 0){
                        m = m*10+i;
                    }
                }
                return m>Integer.MAX_VALUE?-1:(int)m;
            }
            prevRem = currRem;
        }
        return -1;
    }
}