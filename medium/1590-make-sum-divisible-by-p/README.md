# Make Sum Divisible by P

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.

Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.

A subarray is defined as a contiguous block of elements in the array.

 
Example 1:

Input: nums = [3,1,4,2], p = 6
Output: 1
Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.


Example 2:

Input: nums = [6,3,5,2], p = 9
Output: 2
Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.


Example 3:

Input: nums = [1,2,3], p = 3
Output: 0
Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.


 
Constraints:


	1 <= nums.length <= 105
	1 <= nums[i] <= 109
	1 <= p <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-08-23T09:51:55.120Z  

```java
        tot+=n;
       }
       int target=tot%p;
       if(target==0){
        return 0;
       }
       if(tot<p){
        return -1;
       }
       int sum=0;
       boolean valid=false;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(map.containsKey(sum-target) && (sum-target)%p==0){
            min=Math.min(min,i-map.get(sum-target));
            valid=true;
           }
           map.put(sum,i);
       }
       if(valid){
        return min;
       }
       return -1;
    }

```

---

[View on LeetCode](https://leetcode.com/problems/make-sum-divisible-by-p/)