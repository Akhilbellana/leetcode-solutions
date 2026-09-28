# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return *the length of the longest consecutive elements sequence.*

You must write an algorithm that runs in `O(n)` time.

 

**Example 1:**

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

**Example 2:**

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

**Example 3:**

```
Input: nums = [1,0,1,2]
Output: 3

```

 

**Constraints:**

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 36.76%)  
**Memory:** 95.4 MB (beats 61.42%)  
**Submitted:** 2026-09-28T11:35:54.403Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
         int count=0;
         int maxcount=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int x=n;
                count=0;
                while(set.contains(x)){
                    x++;
                    count++;
                }
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)