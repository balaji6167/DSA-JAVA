// Length of the longest substring
// Given a string s, find the length of the longest substring without repeating characters.

// Examples:

// Input: s = "geeksforgeeks"
// Output: 7
// Explanation: Longest substring is "eksforg".
// Input: s = "abdefgabef"
// Output: 6
// Explanation: Longest substring are "abdefg" , "bdefga" and "defgab".
// Input: s = "aaaaa"
// Output: 1
// Explanation: Longest substring is "a".
// Constraints:
// 1 ≤ s.size() ≤ 10^5
// It is guaranteed that all characters of the String s will be lowercase letters from 'a' to 'z'

import java.util.HashSet;
public class Length_of_the_longest_substring {
    int longestUniqueSubstring(String s) {
        // code here
        int maxLen = 0;
        int l = 0;
        HashSet<Character> Set = new HashSet<>();
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