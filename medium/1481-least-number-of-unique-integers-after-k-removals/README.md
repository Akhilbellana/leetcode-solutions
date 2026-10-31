# Least Number of Unique Integers after K Removals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `arr` and an integer `k`. Find the *least number of unique integers* after removing **exactly** `k` elements**.**

 

**Example 1:**

```
Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.

```

**Example 2:**

```
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
```

 

**Constraints:**

- 1 <= arr.length <= 10^5
- 1 <= arr[i] <= 10^9
- 0 <= k <= arr.length

## Solution

**Language:** Java  
**Runtime:** 47 ms (beats 62.83%)  
**Memory:** 81.2 MB (beats 82.80%)  
**Submitted:** 2026-10-31T04:11:23.122Z  

```java
class Solution {
    public int findLeastNumOfUniqueInts(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int val : map.values()) {
            list.add(val);
        }
        int ans = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (k >= list.get(i)) {
                k = k - list.get(i);
            } else {
                return list.size() - i;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/)