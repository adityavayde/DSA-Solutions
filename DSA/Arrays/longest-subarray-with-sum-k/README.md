# [178. Longest subarray with sum KPOTD](https://takeuforward.org/practice/dsa/longest-subarray-with-sum-k?solution=optimal-%28positives-%2B-negatives%29)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array nums of size n and an integer k, find the length of the **longest sub-array** that sums to k. If no such sub-array exists, return 0.

### Example 1:

**Input:** nums = [10, 5, 2, 7, 1, 9],&nbsp;&nbsp;k=15

**Output:** 4

**Explanation:**

The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

### Example 2:

**Input:** nums = [-3, 2, 1],&nbsp;k=6

**Output:** 0

**Explanation:**

There is no sub-array in the array that sums to 6. Therefore, the output is 0.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;1<=n<=10^5
- &nbsp;-10^5<=nums[i]<=10^5
- &nbsp;-10^9<= k<=10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
