# [707. Find row with maximum 1'sPOTD](https://takeuforward.org/practice/dsa/find-row-with-maximum-1's?solution=most-optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, find the **index** of the row with the **maximum number** of ones.

If two rows have the same number of ones, consider the one with a smaller index. If **no 1 exists** in the matrix, return -1.

### Example 1:

Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]

Output: 0

Explanation: The row with the maximum number of ones is 0 (0 - indexed).

### Example 2:

Input: mat =&nbsp;[ [0, 0], [0, 0] ]

Output: -1

Explanation: The matrix does not contain any 1. So, -1 is the answer.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;&nbsp;n == mat.length&nbsp;
- &nbsp;&nbsp;m == mat[i].length&nbsp;
- &nbsp;&nbsp;1 <= n, m <= 100&nbsp;
- &nbsp;&nbsp;mat[i][j] is either 0 or 1.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
