# Longest Well-Performing Interval

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We are given `hours`, a list of the number of hours worked per day for a given employee.

A day is considered to be a *tiring day* if and only if the number of hours worked is (strictly) greater than `8`.

A *well-performing interval* is an interval of days for which the number of tiring days is strictly larger than the number of non-tiring days.

Return the length of the longest well-performing interval.

 

**Example 1:**

```
Input: hours = [9,9,6,0,6,6,9]
Output: 3
Explanation: The longest well-performing interval is [9,9,6].

```

**Example 2:**

```
Input: hours = [6,6,6]
Output: 0

```

 

**Constraints:**

- 1 <= hours.length <= 104
- 0 <= hours[i] <= 16

## Solution

**Language:** Java  
**Runtime:** 1111 ms (beats 5.10%)  
**Memory:** 47.7 MB (beats 15.30%)  
**Submitted:** 2026-10-09T09:04:28.198Z  

```java
class Solution {
    public int longestWPI(int[] hours) {
        int max=0;
        for(int i=0;i<hours.length;i++){
            int tired=0;
            for(int j=i;j<hours.length;j++){
                if(hours[j]>8){
                    tired++;
                }
                if(tired>(j-i+1-tired)){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-well-performing-interval/)