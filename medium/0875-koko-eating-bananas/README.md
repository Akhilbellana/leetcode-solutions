# Koko Eating Bananas

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return *the minimum integer* `k` *such that she can eat all the bananas within* `h` *hours*.

 

**Example 1:**

```
Input: piles = [3,6,7,11], h = 8
Output: 4

```

**Example 2:**

```
Input: piles = [30,11,23,4,20], h = 5
Output: 30

```

**Example 3:**

```
Input: piles = [30,11,23,4,20], h = 6
Output: 23

```

 

**Constraints:**

- 1 <= piles.length <= 104
- piles.length <= h <= 109
- 1 <= piles[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 53.06%)  
**Memory:** 47.9 MB (beats 57.71%)  
**Submitted:** 2026-10-05T09:45:01.417Z  

```java
class Solution {
    static int bs(int l, int h,int[]piles,int hours) {
        int ans=0;
        while (l <= h) {
            int m = l + (h - l) / 2;
            long total = 0;

            for (int n : piles) {
                total = total + ((long) n + m - 1) / m;
            }
            if (total <= hours) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int hours) {
        int max = Integer.MIN_VALUE;
        for (int n : piles) {
            max = Math.max(max, n);
        }
        return bs(1,max,piles,hours);

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/koko-eating-bananas/)