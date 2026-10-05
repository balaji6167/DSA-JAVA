// (Leetcode): 856. Score of Parentheses:

// Given a balanced parentheses string s, return the score of the string.
// The score of a balanced parentheses string is based on the following rule:
// "()" has score 1.
// AB has score A + B, where A and B are balanced parentheses strings.
// (A) has score 2 * A, where A is a balanced parentheses string.

// Example 1:

// Input: s = "()"
// Output: 1

// Example 2:

// Input: s = "(())"
// Output: 2

// Example 3:

// Input: s = "()()"
// Output: 2
 
// Constraints:
// 2 <= s.length <= 50
// s consists of only '(' and ')'.
// s is a balanced parentheses string.

import java.util.*;
public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); 
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int innerScore = stack.pop();
                int outerScore = stack.pop();
                int currentVal = Math.max(2 * innerScore, 1);
                stack.push(outerScore + currentVal);
            }
        }
        return stack.pop();
    }
}