// (Leetcode) 953. Verifying an Alien Dictionary:

// In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

// Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

 

// Example 1:

// Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
// Output: true
// Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
// Example 2:

// Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
// Output: false
// Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
// Example 3:

// Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
// Output: false
// Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 20
// order.length == 26
// All characters in words[i] and order are English lowercase letters.

import java.util.HashMap;
public class AlienSorted {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> Map = new HashMap<>();
        boolean ans = true;
        for(int i=0;i<26;i++){
            Map.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            boolean flag = lexicographicalOrder(words[i],words[i+1],Map);
            if(flag){
                continue;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
    public boolean lexicographicalOrder(String s , String p , HashMap<Character,Integer> Map){
        if(s.equals(p)) return true;
        int minimum = Math.min(s.length(),p.length());
        for(int i=0;i<minimum;i++){
            int a = Map.get(s.charAt(i));
            int b = Map.get(p.charAt(i));
            if(a<b){
                return true;
            }
            else if(a>b){
                return false;
            }
        }
        if(s.length()<=p.length()){
            return true;
        }
        return false;
    }
}
