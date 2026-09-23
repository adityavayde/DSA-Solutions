# [716. Check if an Array Is ConsecutivePOTD](https://takeuforward.org/practice/dsa/check-if-an-array-is-consecutive?tab=solution)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** , return **true** if **nums** is consecutive, *otherwise return* **false** *.*

An array is **consecutive** if it contains every number in the range **[x, x + n - 1]** (inclusive), where **x** is the minimum number in the array and **n** is the length of the array.

### Example 1:

**Input:** nums = [1,3,4,2]

**Output:** true

**Explanation:**

The minimum value is 1 and the length of nums is 4.

All of the values in the range [x, x + n - 1] = [1, 1 + 4 - 1] = [1, 4] = (1, 2, 3, 4) occur in nums.

Therefore, nums is consecutive.

### Example 2:

**Input:** nums = [1,3]

**Output:** false

**Explanation:**

The minimum value is 1 and the length of nums is 2.

The value 2 in the range [x, x + n - 1] = [1, 1 + 2 - 1], = [1, 2] = (1, 2) does not occur in nums.

Therefore, nums is not consecutive.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- 0 <= nums[i] <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
