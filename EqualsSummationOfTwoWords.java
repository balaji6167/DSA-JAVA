// (LeetCode): 1880. Check if Word Equals Summation of Two Words:

// The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
// The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.
// For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
// You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.
// Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.

// Example 1:
// Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
// Output: true
// Explanation:
// The numerical value of firstWord is "acb" -> "021" -> 21.
// The numerical value of secondWord is "cba" -> "210" -> 210.
// The numerical value of targetWord is "cdb" -> "231" -> 231.
// We return true because 21 + 210 == 231.

// Example 2:
// Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
// Output: false
// Explanation: 
// The numerical value of firstWord is "aaa" -> "000" -> 0.
// The numerical value of secondWord is "a" -> "0" -> 0.
// The numerical value of targetWord is "aab" -> "001" -> 1.
// We return false because 0 + 0 != 1.

// Example 3:
// Input: firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
// Output: true
// Explanation: 
// The numerical value of firstWord is "aaa" -> "000" -> 0.
// The numerical value of secondWord is "a" -> "0" -> 0.
// The numerical value of targetWord is "aaaa" -> "0000" -> 0.
// We return true because 0 + 0 == 0.
 

// Constraints:
// 1 <= firstWord.length, secondWord.length, targetWord.length <= 8
// firstWord, secondWord, and targetWord consist of lowercase English letters from 'a' to 'j' inclusive.

public class EqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String str1 = "", str2 = "", str3 = "";
        boolean nonZero1 = true, nonZero2 = true, nonZero3 = true;
        int val1 = 0, val2 = 0, val3 = 0;
        int count1 = 0, count2 = 0, count3 = 0;
        for(int i=0;i<firstWord.length();i++){
            if(i==0 && firstWord.charAt(0)-'a'==0){
                continue;
            }
            else if(firstWord.charAt(i)-'a'==0 && nonZero1){
                continue;
            }
            else{
                count1++;
                str1 += firstWord.charAt(i)-'a'+"";
                nonZero1 = false;
                if(count1==1){
                    val1 = i;
                }
            }
        }
        for(int i=0;i<secondWord.length();i++){
            if(i==0 && secondWord.charAt(0)-'a'==0){
                continue;
            }
            else if(secondWord.charAt(i)-'a'==0 && nonZero2){
                continue;
            }
            else{
                count2++;
                str2 += secondWord.charAt(i)-'a'+"";
                nonZero2 = false;
                if(count2==1){
                    val2 = i;
                }
            }
        }
        for(int i=0;i<targetWord.length();i++){
            if(i==0 && targetWord.charAt(0)-'a'==0){
                continue;
            }
            else if(targetWord.charAt(i)-'a'==0 && nonZero3){
                continue;
            }
            else{
                count2++;                
                str3 += targetWord.charAt(i)-'a'+"";
                nonZero3 = false;
                if(count3==1){
                    val3 = i;
                }
            }
        }
        int ans1 = 0, ans2 = 0, ans3 = 0;
        if(str1.isEmpty()){
            ans1 = 0;
        }else{
            ans1 = Integer.parseInt(str1);
        }
        
        if(str2.isEmpty()){
            ans2 = 0;
        }else{
            ans2 = Integer.parseInt(str2);
        }

        if(str3.isEmpty()){
            ans3 = 0;
        }else{
            ans3 = Integer.parseInt(str3);
        }
        return ans1+ans2==ans3;
    }
}