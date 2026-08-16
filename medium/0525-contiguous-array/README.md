# Contiguous Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 
Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.


Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.


Example 3:

Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.


 
Constraints:


	1 <= nums.length <= 105
	nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 5.37%)  
**Memory:** 65.8 MB (beats 13.70%)  
**Submitted:** 2026-08-16T13:40:27.267Z  

```java
class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      int max=0;
      int sum=0;
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            nums[i]=-1;
        }
        sum+=nums[i];
        if(map.containsKey(sum)){
            max=Math.max(max,i-map.get(sum));
        }
        
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
      }
      return max;
      
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contiguous-array/)