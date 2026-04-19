// Special array reversal
// Given a string S, containing special characters and all the alphabets, reverse the string without
// affecting the positions of the special characters.

// Example 1:

// Input: S = "A&B"
// Output: "B&A"
// Explanation: As we ignore '&' and
// then reverse, so answer is "B&A".
// Example 2:

// Input: S = "A&x#
// Output: "x&A#"
// Explanation: we swap only A and x.

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string as inputs and returns required reverse string.

// Expected Time Complexity: O(|S|)
// Expected Auxiliary Space: O(|S|)

// Constraints:
// 1 ≤ |S| ≤ 10^5

public class SpecialArrayReversal{
    public String reverse(String str) {
        char[] c = str.toCharArray();
        int l = 0;
        int r = c.length-1;
        while(l<r){
            if(Character.isLetter(c[l]) && Character.isLetter(c[r])){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
            else if(Character.isLetter(c[l])){
                r--;
            }
            else{
                l++;
            }
        }
        return String.valueOf(c);
    }
}