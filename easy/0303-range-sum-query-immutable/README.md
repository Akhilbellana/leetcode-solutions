# Range Sum Query - Immutable

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array nums, handle multiple queries of the following type:


	Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.


Implement the NumArray class:


	NumArray(int[] nums) Initializes the object with the integer array nums.
	int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


 
Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3


 
Constraints:


	1 <= nums.length <= 104
	-105 <= nums[i] <= 105
	0 <= left <= right < nums.length
	At most 104 calls will be made to sumRange.

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-08-15T12:10:18.385Z  

```java
class NumArray {
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
        }
    int[] prefix;
           prefix[i+1]=prefix[i]+nums[i];
        prefix=new int[nums.length+1];
            prefix[0]=0;
 * int param_1 = obj.sumRange(left,right);
 */

```

---

[View on LeetCode](https://leetcode.com/problems/range-sum-query-immutable/)