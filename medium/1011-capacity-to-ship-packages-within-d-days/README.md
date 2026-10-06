# Capacity To Ship Packages Within D Days

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A conveyor belt has packages that must be shipped from one port to another within `days` days.

The `ith` package on the conveyor belt has a weight of `weights[i]`. Each day, we load the ship with packages on the conveyor belt (in the order given by `weights`). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within `days` days.

 

**Example 1:**

```
Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

```

**Example 2:**

```
Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4

```

**Example 3:**

```
Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
1st day: 1
2nd day: 2
3rd day: 3
4th day: 1, 1

```

 

**Constraints:**

- 1 <= days <= weights.length <= 5 * 104
- 1 <= weights[i] <= 500

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 77.43%)  
**Memory:** 50.5 MB (beats 6.80%)  
**Submitted:** 2026-10-06T09:45:01.708Z  

```java
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE;
        int h = 0;
        for (int x : weights) {
            l = Math.max(l, x);
            h += x;
        }
        int ans = 0;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int daycount = 1;
            int sum = 0;
            for (int x:weights) {
                if(sum+x>m){
                    daycount++;
                    sum=0;
                }
                sum+=x;
            }
            if (daycount <= days) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)