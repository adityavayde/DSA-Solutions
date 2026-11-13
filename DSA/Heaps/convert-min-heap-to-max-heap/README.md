# [824. Convert Min Heap to Max HeapPOTD](https://takeuforward.org/practice/dsa/convert-min-heap-to-max-heap)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a **min-heap** in array representation named **nums** , convert it into a **max-heap** and return the resulting array.

A **min-heap** is a complete binary tree where the key at the root is the **minimum** among all keys present in a binary min-heap and the same property is **recursively** true for all nodes in the Binary Tree.

A **max-heap** is a complete binary tree where the key at the root is the **maximum** among all keys present in a binary max-heap and the same property is **recursively** true for all nodes in the Binary Tree.

Since there can be multiple answers, the compiler will return true if it's correct, else false.

### Example 1:

**Input:** nums = [10, 20, 30, 21, 23]

**Output:** [30, 21, 23, 10, 20]

**Explanation:**

In the input min heap, 10 is the root (smallest).

After conversion, 30 becomes the root (largest).

Now every parent node is larger than its children:

30 > 21, 30 > 23

21 > 10, 23 > 20

Hence it is a valid max heap.

### Example 2:

**Input:** nums = [-5, -4, -3, -2, -1]

**Output:** [-1, -2, -3, -4, -5]

**Explanation:**

In the input min heap, -5 is the root (smallest among negatives).

After conversion, -1 becomes the root (largest among negatives).

Now every parent node is larger than its children:

-1 > -2, -1 > -3

-2 > -4, -3 > -5

Hence it is a valid max heap.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- nums represents a min-heap

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
