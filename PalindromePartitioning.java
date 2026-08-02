// (LeetCode): 131. Palindrome Partitioning:

// Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
// Example 1:

// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]

// Example 2:

// Input: s = "a"
// Output: [["a"]] 

// Constraints:
// 1 <= s.length <= 16
// s contains only lowercase English letters.

import java.util.*;
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(s,0,path,res);
        return res;
    }
    public void func(String s,int index,List<String> path,List<List<String>> res){
        if(s.length()==index){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(ispalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                func(s,i+1,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s,int start ,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}