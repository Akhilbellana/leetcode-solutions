# Digit Frequency Score

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer n.

The score of n is defined as the sum of d * freq(d) over all distinct digits d, where freq(d) denotes the number of times the digit d appears in n.

Return an integer denoting the score of n.

 
Example 1:


Input: n = 122

Output: 5

Explanation:


	The digit 1 appears 1 time, contributing 1 * 1 = 1.
	The digit 2 appears 2 times, contributing 2 * 2 = 4.
	Thus, the score of n is 1 + 4 = 5.



Example 2:


Input: n = 101

Output: 2

Explanation:


	The digit 0 appears 1 time, contributing 0 * 1 = 0.
	The digit 1 appears 2 times, contributing 1 * 2 = 2.
	Thus, the score of n is 2.



 
Constraints:


	1 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 20.05%)  
**Memory:** 43.1 MB (beats 10.29%)  
**Submitted:** 2026-08-20T20:09:29.847Z  

```java
class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n = n / 10;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            sum+=value*key;   
        }
        return sum;
    }
}        
```

---

[View on LeetCode](https://leetcode.com/problems/digit-frequency-score/)