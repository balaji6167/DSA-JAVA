// (Leetcode): 3775. Reverse Words With Same Vowel Count
// You are given a string s consisting of lowercase English words, each separated by a single space.
// Determine how many vowels appear in the first word. Then, reverse each following word that has the same vowel count. Leave all remaining words unchanged.
// Return the resulting string.
// Vowels are 'a', 'e', 'i', 'o', and 'u'.

// Example 1:

// Input: s = "cat and mice"
// Output: "cat dna mice"
// Explanation:​​​​​​​

// The first word "cat" has 1 vowel.
// "and" has 1 vowel, so it is reversed to form "dna".
// "mice" has 2 vowels, so it remains unchanged.
// Thus, the resulting string is "cat dna mice".

// Example 2:

// Input: s = "book is nice"
// Output: "book is ecin"
// Explanation:

// The first word "book" has 2 vowels.
// "is" has 1 vowel, so it remains unchanged.
// "nice" has 2 vowels, so it is reversed to form "ecin".
// Thus, the resulting string is "book is ecin".

// Example 3:

// Input: s = "banana healthy"
// Output: "banana healthy"
// Explanation:

// The first word "banana" has 3 vowels.
// "healthy" has 2 vowels, so it remains unchanged.
// Thus, the resulting string is "banana healthy".
 
// Constraints:

// 1 <= s.length <= 10^5
// s consists of lowercase English letters and spaces.
// Words in s are separated by a single space.
// s does not contain leading or trailing spaces.

public class ReverseWords {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String vowels = "aeiou";
        int vowelsCount = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(char c:arr[0].toCharArray()){
            if(vowels.contains(c+"")){
                vowelsCount++;
            }
        }
        for(int i=1;i<arr.length;i++){
            int vowelsWord = vowelCount(vowelsCount,arr[i]);
            if(vowelsWord==vowelsCount){
                StringBuilder rev = new StringBuilder(arr[i]);
                rev.reverse();
                sb.append(" "+rev);
            }
            else{
                sb.append(" "+arr[i]);
            }
        }
        return sb.toString();
    }
    public int vowelCount(int vowelsCount,String word){
        int vC = 0;
        String vowels = "aeiou";
        for(char c:word.toCharArray()){
            if(vowels.contains(c+"")){
                vC++;
            }
        }
        return vC;
    }
}