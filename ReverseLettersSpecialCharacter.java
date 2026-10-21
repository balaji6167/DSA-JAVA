// (Leetcode): 3823. Reverse Letters Then Special Characters in a String:

// You are given a string s consisting of lowercase English letters and special characters.
// Your task is to perform these in order:
// Reverse the lowercase letters and place them back into the positions originally occupied by letters.
// Reverse the special characters and place them back into the positions originally occupied by special characters.
// Return the resulting string after performing the reversals.

// Example 1:

// Input: s = ")ebc#da@f("
// Output: "(fad@cb#e)"
// Explanation:
// The letters in the string are ['e', 'b', 'c', 'd', 'a', 'f']:
// Reversing them gives ['f', 'a', 'd', 'c', 'b', 'e']
// s becomes ")fad#cb@e("
// ​​​​​​​The special characters in the string are [')', '#', '@', '(']:
// Reversing them gives ['(', '@', '#', ')']
// s becomes "(fad@cb#e)"

// Example 2:

// Input: s = "z"
// Output: "z"
// Explanation:
// The string contains only one letter, and reversing it does not change the string. There are no special characters.

// Example 3:

// Input: s = "!@#$%^&*()"
// Output: ")(*&^%$#@!"
// Explanation:
// The string contains no letters. The string contains all special characters, so reversing the special characters reverses the whole string.

// Constraints:
// 1 <= s.length <= 100
// s consists only of lowercase English letters and the special characters in "!@#$%^&*()".

public class ReverseLettersSpecialCharacter {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))){
                char temp = s.charAt(start);
                arr[start] = s.charAt(end);
                arr[end] = temp;
                start++;
                end--;
            }
            else if(Character.isLetter(s.charAt(start))){
                end--;
            }
            else{
                start++;
            }
        }
        start = 0;
        end = s.length()-1;
        while(start<=end){
            if(!Character.isLetter(s.charAt(start)) && !Character.isLetter(s.charAt(end))){
                char temp1 = s.charAt(start);
                arr[start] = s.charAt(end);
                arr[end] = temp1;
                start++;
                end--;
            }
            else if(!Character.isLetter(s.charAt(start))){
                end--;
            }
            else{
                start++;
            }
        }
        return new String(arr);
    }
}