// Find one extra character

// Given two strings s1 and s2 which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string and return it. 

// Examples:

// Input: s1 = abcd, s2 = badce
// Output: e
// Input: s1 = efg, s2 = gtfe
// Output: t

public class Find_one_extra_character {
    public static char extraChar(String s1, String s2) {
        char result = 0;
        for(char c:s1.toCharArray()){
            result ^= c;
        }
        for(char c:s2.toCharArray()){
            result ^= c;
        }
        return result;
    }
}