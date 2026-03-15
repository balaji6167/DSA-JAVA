// Longest substring with distinct characters

// You are given a string s. You have to find the length of the longest substring with all distinct characters. 

// Examples:

// Input: s = "geeksforgeeks"
// Output: 7
// Explanation: "eksforg" is the longest substring with all distinct characters.
// Input: s = "aaa"
// Output: 1
// Explanation: "a" is the longest substring with all distinct characters.
// Input: s = "abcdefabcbb"
// Output: 6
// Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
// Constraints:
// 1 ≤ s.size() ≤ 10^5
// s consists of lowercase english letters.

import java.util.HashSet;
public class Distinct_Characters {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> Set = new HashSet<>();
        int l = 0;
        int maxLen = 0;
        for(int r=0;r<s.length();r++){
            if(Set.contains(s.charAt(r))){
                while(l<r && Set.contains(s.charAt(r))){
                    Set.remove(s.charAt(l));
                    l++;
                }
            }
            Set.add(s.charAt(r));
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}