// (Leetcode): 32. Longest Valid Parentheses:

// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

// Example 1:

// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".

// Example 2:

// Input: s = ")()())"
// Output: 4
// Explanation: The longest valid parentheses substring is "()()".

// Example 3:

// Input: s = ""
// Output: 0
 
// Constraints:
// 0 <= s.length <= 3 * 10^4
// s[i] is '(', or ')'.

import java.util.Stack;
public class ValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } 
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } 
                else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }
        return max;
    }
}