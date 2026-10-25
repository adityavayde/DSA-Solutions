# [440. 4 Keys KeyboardPOTD](https://takeuforward.org/practice/dsa/4-keys-keyboard?solution=memoization)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Imagine you have a special keyboard with the following keys:

- A: Print one 'A' on the screen.

- Ctrl-A: Select the whole screen.

- Ctrl-C: Copy selection to buffer.

- Ctrl-V: Print buffer on screen appending it after what has already been printed.

Given an integer n, return the maximum number of 'A' you can print on the screen with at most n presses on the keys.

### Example 1:

**Input:** n = 3

**Output:** 3

**Explanation:**

We can at most get 3 A's on screen by pressing the following key sequence:

A, A, A

### Example 2:

**Input:** n = 7

**Output:** 9

**Explanation:**

We can at most get 9 A's on screen by pressing following key sequence:

A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 50

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
