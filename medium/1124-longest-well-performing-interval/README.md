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
**Runtime:** 859 ms (beats 9.76%)  
**Memory:** 46.8 MB (beats 97.12%)  
**Submitted:** 2026-10-09T09:43:17.446Z  

```java
class Solution {
    public int longestWPI(int[] hours) {
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                hours[i] = 1;
            } else {
                hours[i] = -1;
            }
            sum += hours[i];
            if (sum > 0) {
                max = Math.max(max, i+1);
            } else {
                for(int prevsum :map.keySet()){
                    if(prevsum<sum){
                        max=Math.max(max,i-map.get(prevsum));
                    }
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-well-performing-interval/)