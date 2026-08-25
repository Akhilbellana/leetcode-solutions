# Smallest Missing Multiple Of K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T10:37:01.376Z  

```unknown
1class Solution {
2    public void sortColors(int[] nums) {
3        int i = 0;
4        int curr = 0;
5        int j = nums.length - 1;
6        while (curr <= j) {
7            if (nums[curr] == 2) {
8                int temp1 = nums[curr];
9                nums[curr] = nums[j];
10                nums[j] = temp1;
11                j--;
12                if (nums[curr] == 0) {
13                    int temp2 = nums[curr];
14                    nums[curr] = nums[i];
15                    nums[i] = temp2;
16                    i++;
17                    curr++;
18                }
19
20            } else if (nums[curr] == 0) {
21                int temp3 = nums[curr];
22                nums[curr] = nums[i];
23                nums[i] = temp3;
24                i++;
25                curr++;
26            } else {
27                curr++;
28            }
29        }
30
31    }
32}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-missing-multiple-of-k/)