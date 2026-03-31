// leetcode 500. Keyboard Row

// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
// Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

// Example 1:
// Input: words = ["Hello","Alaska","Dad","Peace"]
// Output: ["Alaska","Dad"]
// Explanation:

// Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.
// Example 2:
// Input: words = ["omk"]
// Output: []

// Example 3:
// Input: words = ["adsdf","sfd"]
// Output: ["adsdf","sfd"]

// Constraints:
// 1 <= words.length <= 20
// 1 <= words[i].length <= 100
// words[i] consists of English letters (both lowercase and uppercase). 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList(
            'q','w','e','r','t','y','u','i','o','p'
        ));
        Set<Character> row2 = new HashSet<>(Arrays.asList(
            'a','s','d','f','g','h','j','k','l'
        ));
        Set<Character> row3 = new HashSet<>(Arrays.asList(
            'z','x','c','v','b','n','m'
        ));
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            Set<Character> targetRow = null;
            char firstChar = lowerWord.charAt(0);
            if (row1.contains(firstChar)) targetRow = row1;
            else if (row2.contains(firstChar)) targetRow = row2;
            else if (row3.contains(firstChar)) targetRow = row3;
            boolean isValid = true;
            for (char c : lowerWord.toCharArray()) {
                if (!targetRow.contains(c)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}