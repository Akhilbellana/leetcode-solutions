# Intersection of Two Arrays II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

 

**Example 1:**

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

```

**Example 2:**

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

```

 

**Constraints:**

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

 

**Follow up:**

- What if the given array is already sorted? How would you optimize your algorithm?
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 31.86%)  
**Memory:** 44.9 MB (beats 65.63%)  
**Submitted:** 2026-09-22T09:34:42.862Z  

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }

        }
        int[]a=new int[list.size()];
        int k=0;
        for(int x:list){
            a[k]=x;
            k++;
        }
        return a;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/)