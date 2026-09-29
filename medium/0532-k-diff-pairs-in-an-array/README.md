# K-diff Pairs in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return *the number of **unique** k-diff pairs in the array*.

A **k-diff** pair is an integer pair `(nums[i], nums[j])`, where the following are true:

- 0 <= i, j < nums.length
- i != j
- |nums[i] - nums[j]| == k

**Notice** that `|val|` denotes the absolute value of `val`.

 

**Example 1:**

```
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

```

**Example 2:**

```
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

```

**Example 3:**

```
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

```

 

**Constraints:**

- 1 <= nums.length <= 104
- -107 <= nums[i] <= 107
- 0 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 17.48%)  
**Memory:** 48.4 MB (beats 6.52%)  
**Submitted:** 2026-09-29T13:53:13.657Z  

```java
class Solution {
    public int findPairs(int[] nums, int k) {
        int i=0;
        int j=1;
        int count=0;
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        while(j<nums.length){
            if(i==j){
                j++;
                continue;
            }
            if(nums[j]-nums[i]==k && j!=i){
                List<Integer>list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                set.add(list);
                i++;
                j++;
            }else if(nums[j]-nums[i]<k){
                j++;
            }else{
                i++;
            }

        }
        return set.size();
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/k-diff-pairs-in-an-array/)