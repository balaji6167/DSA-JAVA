// Reversing the vowels
// Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

// Examples:

// Input: s = "geeksforgeeks"
// Output: "geeksforgeeks"
// Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.
// Input: s = "practice"
// Output: "prectica"
// Explanation: The vowels are a, i, e. Reverse of these is e, i, a.
// Input: s = "bcdfg"
// Output: "bcdfg"
// Explanation: There are no vowels in s.
// Constraints:
// 1<=|s|<=10^5


public class Reversing_the_vowels {
    String modify(String s) {
        // your code here
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        String vowels = "aeiou";
        while(l<r){
            String str = arr[l]+"",str1 = arr[r]+"";
            if(vowels.contains(str) && vowels.contains(str1)){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if(vowels.contains(str)){
                r--;
            }
            else{
                l++;
            }
        }
        return String.valueOf(arr);
    }
}