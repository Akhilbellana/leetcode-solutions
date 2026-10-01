# Intersection of Multiple Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer array `nums` where `nums[i]` is a non-empty array of **distinct** positive integers, return *the list of integers that are present in **each array** of* `nums`* sorted in **ascending order***.

 

**Example 1:**

```
Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]
Explanation: 
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
```

**Example 2:**

```
Input: nums = [[1,2,3],[4,5,6]]
Output: []
Explanation: 
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].

```

 

**Constraints:**

- 1 <= nums.length <= 1000
- 1 <= sum(nums[i].length) <= 1000
- 1 <= nums[i][j] <= 1000
- All the values of nums[i] are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.72%)  
**Memory:** 46.6 MB (beats 43.66%)  
**Submitted:** 2026-10-01T18:37:15.624Z  

```java
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>list=new ArrayList<>();
        int[]freq=new int[1001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                freq[nums[i][j]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==nums.length){
                list.add(i);
            }
        }
        return list;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-multiple-arrays/)