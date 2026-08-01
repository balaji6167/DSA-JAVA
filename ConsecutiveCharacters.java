// (Leetcode): 1446. Consecutive Characters:

// The power of the string is the maximum length of a non-empty substring that contains only one unique character.
// Given a string s, return the power of s.
// Example 1:

// Input: s = "leetcode"
// Output: 2
// Explanation: The substring "ee" is of length 2 with the character 'e' only.

// Example 2:

// Input: s = "abbcccddddeeeeedcba"
// Output: 5
// Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 
// Constraints:
// 1 <= s.length <= 500
// s consists of only lowercase English letters.

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = Integer.MIN_VALUE;
        int count = 1;
        if(s.length()==1) return 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                }
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}