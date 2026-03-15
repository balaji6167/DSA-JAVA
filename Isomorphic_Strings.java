// Isomorphic Strings
// Given two strings s1 and s2 consisting of only lowercase English letters and of equal length, check if these two strings are isomorphic to each other.
// If the characters in s1 can be changed to get s2, then two strings, s1 and s2 are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

// Examples:

// Input: s1 = "aab", s2 = "xxy"
// Output: true
// Explanation: Each character in s1 can be consistently mapped to a unique character in s2 (a → x, b → y).
// Input: s1 = "aab", s2 = "xyz"
// Output: false
// Explanation: Same character 'a' in s1 maps to two different characters 'x' and 'y' in s2.
// Input: s1 = "abc", s2 = "xxz"
// Output: false
// Explanation: Two different characters 'a' and 'b' in s1 maps with same character 'x' in s2. 
// Constraints:
// 1 ≤ s1.size() = s2.size() ≤ 10^5

import java.util.HashMap;
public class Isomorphic_Strings {
    public boolean areIsomorphic(String s1, String s2) {
        HashMap<Character,Character> Map1 = new HashMap<>();
        HashMap<Character,Character> Map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(Map1.containsKey(a) && Map1.get(a)!=b || 
               Map2.containsKey(b) && Map2.get(b)!=a){
                return false;
            }
            Map1.put(a,b);
            Map2.put(b,a);
        }
        return true;
    }
}