# Counting Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Do not solve it with built-in functions (i.e., like __builtin_popcount in C++).
 
Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10


Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101


 
Constraints:


	0 <= n <= 105


 
Follow up:


	It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 22.09%)  
**Memory:** 48.7 MB (beats 31.22%)  
**Submitted:** 2026-08-27T18:09:22.934Z  

```java
class Solution {
    public int[] countBits(int n) {
        
        int[] a = new int[n + 1];
        a[0]=0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int val=i;
            while(val>0){
            if ((val & 1) != 0) {
                count++;
            }
            val=val>>1;
            }
            a[i] = count;
        }
        return a;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/counting-bits/)