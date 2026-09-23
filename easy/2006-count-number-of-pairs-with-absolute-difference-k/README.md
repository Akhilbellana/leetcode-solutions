# Count Number of Pairs With Absolute Difference K

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return *the number of pairs* `(i, j)` *where* `i < j` *such that* `|nums[i] - nums[j]| == k`.

The value of `|x|` is defined as:

- x if x >= 0.
- -x if x < 0.

 

**Example 1:**

```
Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]

```

**Example 2:**

```
Input: nums = [1,3], k = 3
Output: 0
Explanation: There are no pairs with an absolute difference of 3.

```

**Example 3:**

```
Input: nums = [3,2,1,5,4], k = 2
Output: 3
Explanation: The pairs with an absolute difference of 2 are:
- [3,2,1,5,4]
- [3,2,1,5,4]
- [3,2,1,5,4]

```

 

**Constraints:**

- 1 <= nums.length <= 200
- 1 <= nums[i] <= 100
- 1 <= k <= 99

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 11.12%)  
**Memory:** 46.9 MB (beats 6.52%)  
**Submitted:** 2026-09-23T19:33:15.033Z  

```java
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey((nums[i]-k))){
                count+=map.get((nums[i]-k));
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);   
        }
        return count;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/)