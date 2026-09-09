# Count Commas in Range II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:


	A comma is inserted after every three digits from the right.
	Numbers with fewer than 4 digits contain no commas.


 
Example 1:


Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.


Example 2:


Input: n = 998

Output: 0

Explanation:

​​​​​​​All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.


 
Constraints:


	1 <= n <= 1015

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.36%)  
**Memory:** 42.1 MB (beats 97.44%)  
**Submitted:** 2026-09-09T07:41:38.181Z  

```java
class Solution {
    public long countCommas(long n) {
        long count = 0;
        long num = n;

        while (num > 999) {

            if (num <= 999999) {
                count += (num - 999);
                num = num - (num - 999);

            } else if (num <= 999999999) {
                count += (num - 999999) * 2;
                num = num - (num - 999999);

            } else if (num <= 999999999999L) {
                count += (num - 999999999) * 3;
                num = num - (num - 999999999);

            } else if (num <= 999999999999999L) {
                count += (num - 999999999999L) * 4;
                num = num - (num - 999999999999L);

            } else if (num <= 999999999999999999L) {
                count += (num - 999999999999999L) * 5;
                num = num - (num - 999999999999999L);

            } else {
                count += (num - 999999999999999999L) * 6;
                num = num - (num - 999999999999999999L);
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/)