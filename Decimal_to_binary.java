// Decimal to binary
// Difficulty: EasyAccuracy: 55.75%Submissions: 41K+Points: 2
// Given a decimal number n, return its binary equivalent.

// Examples :

// Input: n = 12
// Output: 1100
// Explanation: The binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21 + 0×20
// Input: n = 33
// Output: 100001
// Explanation: The binary representation of 33 is "100001", since 33 = 1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20
// Constraints:
// 1 ≤ n ≤ 2^31 - 1

public class Decimal_to_binary {
    static String decToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int digit = n%2;
            sb.append(digit);
            n /= 2;
        }
        return sb.reverse().toString();
    }   
}