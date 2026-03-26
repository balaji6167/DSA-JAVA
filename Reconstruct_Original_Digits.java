// 423. Reconstruct Original Digits from English

// Given a string s containing an out-of-order English representation of digits 0-9, return the digits in ascending order.

// Example 1:

// Input: s = "owoztneoer"
// Output: "012"
// Example 2:

// Input: s = "fviefuro"
// Output: "45"
 
// Constraints:

// 1 <= s.length <= 10^5
// s[i] is one of the characters ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"].
// s is guaranteed to be valid.

public class Reconstruct_Original_Digits {
    public String originalDigits(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int[] digit = new int[10];
        digit[0] = freq['z'-'a'];
        digit[2] = freq['w'-'a'];
        digit[4] = freq['u'-'a'];
        digit[6] = freq['x'-'a'];
        digit[8] = freq['g'-'a'];

        digit[3] = freq['h'-'a']-digit[8];
        digit[5] = freq['f'-'a']-digit[4];
        digit[7] = freq['s'-'a']-digit[6];
        digit[1] = freq['o'-'a']-digit[0]-digit[2]-digit[4];
        digit[9] = freq['i'-'a']-digit[5]-digit[6]-digit[8];

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=9;i++){
            for(int j=0;j<digit[i];j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}