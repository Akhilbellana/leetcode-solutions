# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

 
Example 1:

Input: nums = [3,2,3]
Output: [3]


Example 2:

Input: nums = [1]
Output: [1]


Example 3:

Input: nums = [1,2]
Output: [1,2]


 
Constraints:


	1 <= nums.length <= 5 * 104
	-109 <= nums[i] <= 109


 
Follow up: Could you solve the problem in linear time and in O(1) space?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-17T09:11:00.745Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])>n/3){
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                }
            }

        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)