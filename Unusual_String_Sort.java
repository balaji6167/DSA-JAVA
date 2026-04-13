// Unusual String Sort

// Given a string composed of both lowercase and uppercase letters. Sort it in such a manner such that the uppercase and lowercase letter comes in an alternate manner but in sorted way.

// Example 1:

// Input:
// S = bAwutndekWEdkd
// Output: AbEdWddekkntuw
// Explanation: letters A,E,W are sorted 
// as well as letters b,d,d,d,e,k,k,n,t,u,w are 
// sorted and both appears alternately in the 
// string as far as possible.
// â€‹Example 2:

// Input: 
// S = AiBFR
// Output: AiBFR
// Explanation: letters A,B,F,R and sorted 
// as well as letter i. 

// User Task:
// You don't need to read input or print anything. You just have to complete the function stringSort () which takes a string as input and returns the sorted string as described in the problem description.

// Expected Time Complexity: O(|S|).
// Expected Auxiliary Space: O(1). 

// Constraints:
// 1<=|S|<=1000


import java.util.Arrays;
public class Unusual_String_Sort {
    public static String stringSort(String s) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.append(c+"");
            }
            else{
                lower.append(c+"");
            }
        }
        char[] arr1 = lower.toString().toCharArray();
        char[] arr2 = upper.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        while(i < arr1.length && i < arr2.length){
            sb.append(arr2[i]); 
            sb.append(arr1[i]); 
            i++;
        }
        while(i < arr1.length){
            sb.append(arr1[i++]);
        }
        while(i < arr2.length){
            sb.append(arr2[i++]);
        }
        return sb.toString();
    }
}