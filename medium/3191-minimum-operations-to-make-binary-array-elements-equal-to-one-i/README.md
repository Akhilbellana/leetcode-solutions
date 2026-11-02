# Minimum Operations to Make Binary Array Elements Equal to One I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a binary array `nums`.

You can do the following operation on the array **any** number of times (possibly zero):

- Choose any 3 consecutive elements from the array and flip all of them.

**Flipping** an element means changing its value from 0 to 1, and from 1 to 0.

Return the **minimum** number of operations required to make all elements in `nums` equal to 1. If it is impossible, return -1.

 

**Example 1:**

**Input:** nums = [0,1,1,1,0,0]

**Output:** 3

**Explanation:**
We can do the following operations:

- Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
- Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
- Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].

**Example 2:**

**Input:** nums = [0,1,1,1]

**Output:** -1

**Explanation:**
It is impossible to make all elements equal to 1.

 

**Constraints:**

- 3 <= nums.length <= 105
- 0 <= nums[i] <= 1

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 12.24%)  
**Memory:** 102.4 MB (beats 45.70%)  
**Submitted:** 2026-11-02T05:56:41.716Z  

```java
class Solution {
    public int minOperations(int[] nums) {
        int i=0;
        int cnt=0;
        while(i<nums.length){
            while(i<nums.length && nums[i]==1){
                i++;
            }
            if(i==nums.length){
                return cnt;
            }
            if(i+2>=nums.length){
                return -1;
            }else{
                int j=i+2;
                for(int k=i;k<=j;k++){
                    nums[k]=nums[k]==0 ? 1 :0;
                }
                cnt++;
            }
            i++;
        }
        return cnt;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/)