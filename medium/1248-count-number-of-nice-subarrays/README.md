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
**Runtime:** 44 ms (beats 18.83%)  
**Memory:** 56.2 MB (beats 90.94%)  
**Submitted:** 2026-09-19T11:27:19.602Z  

```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=0;
            }else{
                sum+=1;
            }
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-nice-subarrays/)