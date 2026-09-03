// (Leetcode) 264. Ugly Number II:

// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
// Given an integer n, return the nth ugly number.

// Example 1:
// Input: n = 10
// Output: 12
// Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.

// Example 2:
// Input: n = 1
// Output: 1
// Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 
// Constraints:
// 1 <= n <= 1690

import java.util.HashSet;
import java.util.PriorityQueue;
public class UglyNumber {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> hSet = new HashSet<>();
        pq.add(1L);
        hSet.add(1L);
        long uglyNumII = 1;
        for(int i=0;i<n;i++){
            uglyNumII = pq.poll();
            for(int factor:new int[]{2,3,5}){
                long newUgly = factor*uglyNumII;
                if(hSet.add(newUgly)){
                    pq.add(newUgly);
                }
            }
        }
        return (int)uglyNumII;
    }
}