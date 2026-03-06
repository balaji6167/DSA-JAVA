// Longest Substring with K Uniques
// You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

// Note : If no such substring exists, return -1. 

// Examples:

// Input: s = "aabacbebebe", k = 3
// Output: 7
// Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
// Input: s = "aaaa", k = 2
// Output: -1
// Explanation: There's no substring with 2 distinct characters.
// Input: s = "aabaaab", k = 2
// Output: 7
// Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
// Constraints:
// 1 ≤ s.size() ≤ 10^5
// 1 ≤ k ≤ 26
import java.util.HashMap;
public class Longest_Substring {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> Map = new HashMap<>();
        int l = 0, maxlen = -1;
        for(int r=0;r<s.length();r++){
            Map.put(s.charAt(r),Map.getOrDefault(s.charAt(r),0)+1);
            while(Map.size()>k){
                Map.put(s.charAt(l),Map.get(s.charAt(l))-1);
                if(Map.get(s.charAt(l))==0){
                    Map.remove(s.charAt(l));
                }
                l++;
            }
            if(Map.size()==k){
                maxlen = Math.max(maxlen,r-l+1);
            }
        }
        return maxlen;
    }
}