# Range Vowel Count Queries

<div align="left">

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-F59E0B?style=for-the-badge)
![Platform: GeeksforGeeks](https://img.shields.io/badge/Platform-GeeksforGeeks-2F8D46?style=for-the-badge&logo=geeksforgeeks&logoColor=white)
![Language: Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge)

</div>

## Difficulty: Medium

## Platform: GeeksforGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/range-vowel-count-queries-static/1)

## Solved On
26 Nov 2026 at 10:31 pm

---

## Problem Description

<p data-pm-slice="1 1 []"><span style="font-size: 14pt;">Given a string <strong>s</strong> and a 2D array <strong>queries[][]</strong>, where each query consists of two integers <strong>l</strong> and <strong>r</strong>, find the number of vowels in the substring <strong>s[l....r]</strong> for each query. </span><span style="font-size: 14pt;">The substring includes both indices l and r. </span></p><p data-pm-slice="1 1 []"><span style="font-size: 14pt;">Return an array containing the answers to all queries in the order they are given.</span></p><p><strong><span style="font-size: 14pt;">Examples:</span></strong></p><pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "geeksforgeeks", queries[][] = [[1, 3], [2, 4], [1, 9]]</span><br><span style="font-size: 14pt;"><strong>Output:</strong> [2, 1, 4]</span><br><strong><span style="font-size: 14pt;">Explanation:</span></strong><br><span style="font-size: 14pt;">Query 1: "eek" has 2 vowels (e, e).</span><br><span style="font-size: 14pt;">Query 2: "eks" has 1 vowel (e).</span><br><span style="font-size: 14pt;">Query 3: "eeksforge" has 4 vowels (e, e, o, e).</span></pre><pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "helloworld", queries[][] = [[0, 4], [5, 9], [0, 9]]</span><br><span style="font-size: 14pt;"><strong>Output:</strong> [2, 1, 3]</span><br><strong><span style="font-size: 14pt;">Explanation:</span></strong><br><span style="font-size: 14pt;">Query 1: "hello" has 2 vowels (e, o).</span><br><span style="font-size: 14pt;">Query 2: "world" has 1 vowel (o).</span><br><span style="font-size: 14pt;">Query 3: "helloworld" has 3 vowels (e, o, o).</span></pre>

---

## Solutions

### [solution1.java](./solution1.java)
- **Language:** Java

---
*Auto-committed via [SyncCodeX Extension](https://github.com)*
