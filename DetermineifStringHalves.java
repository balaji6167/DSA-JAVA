// (leetcode)1704. Determine if String Halves Are Alike

// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
// Return true if a and b are alike. Otherwise, return false.

// Example 1:

// Input: s = "book"
// Output: true
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
// Example 2:

// Input: s = "textbook"
// Output: false
// Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
// Notice that the vowel o is counted twice.
 
// Constraints:

// 2 <= s.length <= 1000
// s.length is even.
// s consists of uppercase and lowercase letters.

public class DetermineifStringHalves {
    public boolean halvesAreAlike(String s) {
        int l = 0;
        int r = s.length()-1;
        String vowels = "aeiouAEIOU";
        int leftCount = 0;
        int rightCount = 0;
        while(l<r){
            if(vowels.contains(s.charAt(l)+"") && vowels.contains(s.charAt(r)+"")){
                leftCount++;
                rightCount++;
            }
            else if(vowels.contains(s.charAt(l)+"")){
                leftCount++;
            }
            else if(vowels.contains(s.charAt(r)+"")){
                rightCount++;
            }
            l++;
            r--;
        }
        if(leftCount==rightCount){
            return true;
        }
        return false;
    }
}