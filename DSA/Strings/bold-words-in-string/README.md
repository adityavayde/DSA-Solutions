# [497. Bold Words in StringPOTD](https://takeuforward.org/practice/dsa/bold-words-in-string?solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of keywords words and a string s, make all appearances of all keywords words[i] in s bold. Any letters between <b> and </b> tags become bold.

Return s after adding the bold tags. The returned string should use the least number of tags possible, and the tags should form a valid combination.

Note: Keywords can overlap with themselves (e.g., finding "aba" twice in "ababa") or with other keywords. Any overlapping or immediately adjacent bold intervals must be merged into a single <b>...</b> tag pair.

### Example 1:

**Input: words** = ["ab","bc"], **s** = "aabcd"

**Explanation:**

- We need to find all occurrences of the keywords in the string s and wrap them in bold tags <b> and </b>.
- The string s = "aabcd" contains two keywords: "ab" and "bc".
- The keyword "ab" starts at index 1 and ends at index 2.
- The keyword "bc" starts at index 2 and ends at index 3.
- Notice that the keywords "ab" and "bc" overlap at index 2, so we need to carefully wrap them with a single set of bold tags to avoid redundant tags.

The final string should look like:

"a<b>abc</b>d"

This is the minimal valid solution with the least number of tags.

**Output:** "a<b>abc</b>d"

### Example 2:

**Input:** words = ["ab","cb"], **s** = "aabcd"

**Explanation:**

- The string s = "aabcd" contains two keywords: "ab" and "cb".
- The keyword "ab" starts at index 1 and ends at index 2.
- The keyword "cb" starts at index 2 and ends at index 3.
- The keywords don't overlap here, so we can individually wrap each keyword in bold tags without concern for redundancy.

The final string should look like: "a<b>ab</b>cd"

This is the minimal valid solution.

**Output:** "a<b>ab</b>cd"

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 500
- 0 <= words.length <= 50
- 1 <= words[i].length <= 10
- s and words[i] consist of lowercase English letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
