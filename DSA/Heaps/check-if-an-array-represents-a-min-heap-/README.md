# [974. Check if an array represents a min heap POTD](https://takeuforward.org/practice/dsa/check-if-an-array-represents-a-min-heap-)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers nums. Check whether the array represents a **binary min-heap** or not. Return true if it does, otherwise return false.

A binary min-heap is a complete binary tree where the key at the root is the minimum among all keys present in a binary min-heap and the same property is recursively true for all nodes in a Binary Tree.

### Example 1:

**Input:** nums = [10, 20, 30, 21, 23]

**Output:** true

**Explanation:** Each node has a lower or equal value than its children.

### Example 2:

**Input:** nums = [10, 20, 30, 25, 15]

**Output:** false

**Explanation:** The node with value 20 has a child with value 15, thus it is not a min-heap.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- The array represents a complete binary tree.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
