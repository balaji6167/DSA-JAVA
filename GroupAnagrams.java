// (LeetCode) 49. Group Anagrams:

// Given an array of strings strs, group the anagrams together. You can return the answer in any order. 
// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Explanation:
// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

// Example 2:

// Input: strs = [""]
// Output: [[""]]

// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]
// Constraints:
// 1 <= strs.length <= 10^4
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            String groupanagram = getFreq(str);
            if(map.containsKey(groupanagram)){
                map.get(groupanagram).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(groupanagram ,strList);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getFreq(String str){
        int[] freq = new int[26];
        char c = 'a';
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i:freq){
            sb.append(c);
            sb.append(i);
            c++;   
        }
        return sb.toString();
    }
}