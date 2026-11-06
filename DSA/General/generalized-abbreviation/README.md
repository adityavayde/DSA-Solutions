# [545. Generalized AbbreviationPOTD](https://takeuforward.org/practice/dsa/generalized-abbreviation?solution=brute)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A word's generalized abbreviation can be constructed by taking any number of non-overlapping and non-adjacent substrings and replacing them with their respective lengths.

For example, "abcde" can be abbreviated into:

- "a3e" ("bcd" turned into "3")
- "1bcd1" ("a" and "e" both turned into "1")
- "5" ("abcde" turned into "5")
- "abcde" (no substrings replaced)

However, these abbreviations are invalid:

- "23" ("ab" turned into "2" and "cde" turned into "3") is invalid as the substrings chosen are adjacent.
- "22de" ("ab" turned into "2" and "bc" turned into "2") is invalid as the substring chosen overlap.
- Given a string word, return a list of all the possible generalized abbreviations of word. Return the answer in any order.

### Example 1:

**Input:** "word"

**Output:** ["4","3d","2r1","2rd","1o2","1o1d","1or1","1ord","w3","w2d","w1r1","w1rd","wo2","wo1d","wor1","word"]

**Explanation:**

We can either abbreviate a character or keep it, ensuring that numbers do not appear consecutively. For example:

- "4" means the whole word is replaced by its length.
- "3d" means "wor" is replaced with 3, and "d" remains.
- "2r1" means "wo" is replaced with 2, "r" remains, and "d" is replaced with 1.
- "word" remains unchanged.

All valid cases are generated recursively.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= word.length <= 15
- word consists of only lowercase English letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
