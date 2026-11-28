# [531. Find Anagram MappingsPOTD](https://takeuforward.org/practice/dsa/find-anagram-mappings?solution=optimal)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are given two integer arrays, nums1 and nums2, where nums2 is an anagram of nums1. Both arrays may contain duplicates.

Return an index mapping array mapping from nums1 to nums2, where mapping[i] = j means the i-th element in nums1 appears in nums2 at index j. If there are multiple answers, return any of them.

An array a is an anagram of an array b means b is made by randomizing the order of the elements in a.

**After returning array, our driver code will validate output and prints "true" if output is correct else will show output and expected one.**

### Example 1:

<h4>

**Input:** &nbsp;nums1 = [20, 40, 60, 80, 100], nums2 = [100, 20, 80, 60, 40]</h4><h4>

**Output:** [1, 4, 3, 2, 0]</h4><h4>

**Explanation:** </h4>
- mapping[0] = 1 because the 0-th element of nums1 appears at nums2[1].
- mapping[1] = 4 because the 1-st element of nums1 appears at nums2[4], and so on.

### Example 2:

<h4>

**Input:** nums1 = [75, 90], nums2 = [75, 90]</h4><h4>

**Output:** [0, 1]</h4><h4>

**Explanation:** </h4>
- mapping[0] = 0 because 75 appears at nums2[0].
- mapping[1] = 1 because 90 appears at nums2[1].

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums1.length <= 100
- nums2.length == nums1.length
- 0 <= nums1[i], nums2[i] <= 10^5
- nums2 is an anagram of nums1.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
