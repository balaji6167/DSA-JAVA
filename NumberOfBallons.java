// (Leetcode): 1189. Maximum Number of Balloons:

// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

// Example 1:

// Input: text = "nlaebolko"
// Output: 1

// Example 2:

// Input: text = "loonbalxballpoon"
// Output: 2

// Example 3:

// Input: text = "leetcode"
// Output: 0

// Constraints:
// 1 <= text.length <= 104
// text consists of lower case English letters only.

public class NumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        int bcount = 0;int acount = 0;
        int lcount = 0;int ocount = 0;
        int ncount = 0;
        for(char c:text.toCharArray()){
            if(c=='b'){ bcount++; }
            else if(c=='a'){ acount++; }
            else if(c=='l'){ lcount++; }
            else if(c=='o'){ ocount++; }
            else if(c=='n'){ ncount++; }
        }
        lcount /= 2;ocount /= 2;
        arr[0] = bcount;arr[1] = acount;
        arr[2] = lcount;arr[3] = ocount;
        arr[4] = ncount;int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){ return 0; }
            min = Math.min(min,arr[i]);
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}