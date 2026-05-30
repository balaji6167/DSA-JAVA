// (LeetCode): 1078. Occurrences After Bigram:

// Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.
// Return an array of all the words third for each occurrence of "first second third".

// Example 1:

// Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
// Output: ["girl","student"]

// Example 2:

// Input: text = "we will we will rock you", first = "we", second = "will"
// Output: ["we","rock"] 

// Constraints:

// 1 <= text.length <= 1000
// text consists of lowercase English letters and spaces.
// All the words in text are separated by a single space.
// 1 <= first.length, second.length <= 10
// first and second consist of lowercase English letters.
// text will not have any leading or trailing spaces.

import java.util.ArrayList;
public class OccurencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strArr = text.split(" ");
        ArrayList<String> Str = new ArrayList<>();
        for(int i=0;i<strArr.length-2;i++){
            if(strArr[i].equals(first) && strArr[i+1].equals(second)){
                Str.add(strArr[i+2]);
            }
        }
        if(Str.size()==0) {
            return new String[] {};
        }
        String[] result = new String[Str.size()];
        for(int i=0;i<Str.size();i++){
            result[i] = Str.get(i);
        }
        return result;
    }
}