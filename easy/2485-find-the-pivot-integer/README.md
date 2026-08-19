# Find the Pivot Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer n, find the pivot integer x such that:


	The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.


Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

 
Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.


Example 2:

Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.


Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.


 
Constraints:


	1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 24.21%)  
**Memory:** 42.9 MB (beats 9.04%)  
**Submitted:** 2026-08-19T19:23:24.783Z  

```java
class Solution {
    public int pivotInteger(int n) {
        int[] prefix=new int[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+i;
        }
        for(int i=1;i<n+1;i++){
            if(prefix[i]==prefix[n]-prefix[i-1]){
                return i;
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-pivot-integer/)