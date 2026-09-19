# Count Number of Nice Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`. A continuous subarray is called **nice** if there are `k` odd numbers on it.

Return *the number of **nice** sub-arrays*.

 

**Example 1:**

```
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

```

**Example 2:**

```
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

```

**Example 3:**

```
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16

```

 

**Constraints:**

- 1 <= nums.length <= 50000
- 1 <= nums[i] <= 10^5
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 88.15%)  
**Memory:** 59.9 MB (beats 7.69%)  
**Submitted:** 2026-09-19T11:30:10.693Z  

```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int count=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[i]%2!=0){
                    odd--;
                }
                i++;
            }
            if(odd==k){
                int temp=i;
                int even=0;
                while(nums[temp]%2==0){
                    even++;
                    temp++;
                }
                count+=even+1;
            }
            j++;
        }
        return count;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-nice-subarrays/)