// (LeetCode) 2259. Remove Digit From Number to Maximize Result:

// You are given a string number representing a positive integer and a character digit.
// Return the resulting string after removing exactly one occurrence of digit from number such that the value of the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least once in number.

// Example 1:
// Input: number = "123", digit = "3"
// Output: "12"
// Explanation: There is only one '3' in "123". After removing '3', the result is "12".

// Example 2:
// Input: number = "1231", digit = "1"
// Output: "231"
// Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
// Since 231 > 123, we return "231".

// Example 3:
// Input: number = "551", digit = "5"
// Output: "51"
// Explanation: We can remove either the first or second '5' from "551".
// Both result in the string "51".
 
// Constraints:
// 2 <= number.length <= 100
// number consists of digits from '1' to '9'.
// digit is a digit from '1' to '9'.
// digit occurs at least once in number.

public class RemoveDigitToMaxString{
    public String removeDigit(String number, char digit) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<number.length();i++){
            int num = number.charAt(i)-'0';
            if(num==(digit-'0')){ 
                list.add(i);
            }
        }
        map.put(digit-'0',list);
        String max = "";
        List<Integer> ans = map.get(digit-'0');
        for(int i=0;i<ans.size();i++){
            StringBuilder str = new StringBuilder(number);
            str.deleteCharAt(ans.get(i));
            String res = str.toString();
            if(res.compareTo(max)>0){
                max = res;
            }
        }
        return max;
    }
}