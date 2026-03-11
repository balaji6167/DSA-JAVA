// Parenthesis Checker
// Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.
// An expression is balanced if:

// Each opening bracket has a corresponding closing bracket of the same type.
// Opening brackets must be closed in the correct order.
// Examples :

// Input: s = "[{()}]"
// Output: true
// Explanation: All the brackets are well-formed.
// Input: s = "[()()]{}"
// Output: true
// Explanation: All the brackets are well-formed.
// Input: s = "([]"
// Output: false
// Explanation: The expression is not balanced as there is a missing ')' at the end.
// Input: s = "([{]})"
// Output: false
// Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
// Constraints:
// 1 ≤ s.size() ≤ 10^6
// s[i] ∈ {'{', '}', '(', ')', '[', ']'}

import java.util.Stack;
public class Parenthesis_Checker {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}