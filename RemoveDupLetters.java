// (LeetCode) 316. Remove Duplicate Letters:

// Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
// Example 1:

// Input: s = "bcabc"
// Output: "abc"

// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"

// Constraints:
// 1 <= s.length <= 10^4
// s consists of lowercase English letters.

import java.util.ArrayDeque;
import java.util.Deque;
public class RemoveDupLetters{
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }
        boolean[] visited = new boolean[26];
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(visited[c-'a']){
                continue;
            }
            while(!st.isEmpty() && c<st.peek() && lastIndex[st.peek()-'a']>i){
                char removed = st.pop();
                visited[removed-'a'] = false;
            }
            st.push(c);
            visited[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}