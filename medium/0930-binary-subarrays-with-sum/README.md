# Binary Subarrays With Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

 
Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]


Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15


 
Constraints:


	1 <= nums.length <= 3 * 104
	nums[i] is either 0 or 1.
	0 <= goal <= nums.length

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-08-16T14:06:45.460Z  

```java
        while(j<nums.length){
            sum+=nums[j];
        }
            while(sum>goal){
                if(nums[i]==1){
            }
                    sum--;
                }
                i++;
            j++;
            if(sum==goal){
                count+=j-i+1;
            }
        return count;
        int count=0;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/binary-subarrays-with-sum/)