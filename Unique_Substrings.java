// Unique Substrings

// Given a string s. Calculate the total number of unique substrings of the given string.

// Examples:

// Input: s = "abd"
// Ouput: 6
// Explanation: The 6 unique substrings are ["a", "b", "d", "ab", "bd", "abd"].
// Input: s = "jaja"
// Ouput: 7
// Explanation: 
// The substrings will be ["j", "a", "j", "a", "ja", "aj", "ja", "jaj", "aja", "jaja"].
// Out of these the unique are ["j", "a", "ja", "aj", "jaj", "aja", "jaja"].
// Constraints:
// 1 <= |s| <= 100


import java.util.HashSet;
public class Unique_Substrings {
    public static int unique_substring(String s) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subStr = s.substring(i,j+1);
                set.add(subStr);
            }
        }
        return set.size();
    }   
}