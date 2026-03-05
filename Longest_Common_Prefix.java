// Longest Common Prefix of Strings

// Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

// Examples :

// Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
// Output: "gee"
// Explanation: "gee" is the longest common prefix in all the given strings.
// Input: arr[] = ["hello", "world"]
// Output: ""
// Explanation: There's no common prefix in the given strings.
// Constraints:
// 1 ≤ |arr| ≤ 10^3
// 1 ≤ |arr[i]| ≤ 103


public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}