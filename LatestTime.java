// (leetcode): 1736. Latest Time by Replacing Hidden Digits
// You are given a string time in the form of  hh:mm, where some of the digits in the string are hidden (represented by ?).
// The valid times are those inclusively between 00:00 and 23:59.

// Return the latest valid time you can get from time by replacing the hidden digits.
// Example 1:

// Input: time = "2?:?0"
// Output: "23:50"
// Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.

// Example 2:

// Input: time = "0?:3?"
// Output: "09:39"

// Example 3:

// Input: time = "1?:22"
// Output: "19:22"

// Constraints:

// time is in the format hh:mm.
// It is guaranteed that you can produce a valid time from the given string.


public class LatestTime {
    public String maximumTime(String time) {
        char H1 = time.charAt(0),H2 = time.charAt(1);
        char M1 = time.charAt(3),M2 = time.charAt(4);
        if(H1=='?'){
            if(H2=='?' || H2<='3'){
                H1 = '2';
            }
            else{
                H1 = '1';
            }
        }
        if(H2=='?'){
            if(H1=='2'){
                H2 = '3';
            }
            else{
                H2 = '9';
            }
        }
        if(M1=='?'){
            M1 = '5';
        }
        if(M2=='?'){
            M2 = '9';
        }
        return H1+""+H2+""+":"+M1+""+M2+"";
    }
}