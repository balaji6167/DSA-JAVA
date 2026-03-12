// Substrings with K Distinct

// You are given a string s consisting of lowercase characters and an integer k, You have to count all possible substrings that have exactly k distinct characters.

// Examples :

// Input: s = "abc", k = 2
// Output: 2
// Explanation: Possible substrings are ["ab", "bc"]
// Input: s = "aba", k = 2
// Output: 3
// Explanation: Possible substrings are ["ab", "ba", "aba"]
// Input: s = "aa", k = 1
// Output: 3
// Explanation: Possible substrings are ["a", "a", "aa"]
// Constraints:
// 1 ≤ s.size() ≤ 10^6
// 1 ≤ k ≤ 26
import java.util.HashMap;
public class Substrings_with_K_Distinct {
    public int countSubstr(String s, int k){
        return atMost(s,k)-atMost(s,k-1);
    }
    public int atMost(String s, int k) {
        HashMap<Character,Integer> Map = new HashMap<>();
        int l = 0 , count = 0;
        for(int r=0;r<s.length();r++){
            Map.put(s.charAt(r),Map.getOrDefault(s.charAt(r),0)+1);
            while(Map.size()>k){
                Map.put(s.charAt(l),Map.get(s.charAt(l))-1);
                if(Map.get(s.charAt(l))==0){
                    Map.remove(s.charAt(l));
                }
                l++;
            }
            count += (r-l+1);
        }
        return count;
    }   
}