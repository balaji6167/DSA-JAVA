//  Addition Strings:

// Given two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2, also represented as a string.
// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "5"

// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "579"
 
// Constraints:
// 1 <= num1.length, num2.length <= 200
// num1 and num2 consist of digits only.
// Both num1 and num2 do not contain any leading zero, except the number 0 itself.

public class AdditionStrings {
    public String addStrings(String num1,String num2){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 || carry>0){
            int digit1 = i>=0?num1.charAt(i--)-'0':0;
            int digit2 = j>=0?num2.charAt(j--)-'0':0;
            int sum = digit1+digit2+carry;
            sb.append(sum%10);
            carry = sum/10;
        }
        return sb.reverse().toString();
    }
}