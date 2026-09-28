# [594. Output Contest MatchesPOTD](https://takeuforward.org/practice/dsa/output-contest-matches)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

During the NBA playoffs, we always set the rather strong team to play with the rather weak team, like making the rank 1 team play with the rank nth team, which is a good strategy to make the contest more interesting.

Given n teams, return their final contest matches in the form of a string.

The n teams are labeled from 1 to n, which represents their initial rank (i.e., Rank 1 is the strongest team and Rank n is the weakest team).

We will use parentheses '(', and ')' and commas ',' to represent the contest team pairing. We use the parentheses for pairing and the commas for partition. During the pairing process in each round, you always need to follow the strategy of making the rather strong one pair with the rather weak one.

### Example 1:

Input: <code style="color:rgba(239, 241, 246, 0.75);background-color:rgba(255, 255, 255, 0.07)">n == 4</code>&nbsp;

Output: "((1,4),(2,3))"

Explanation:

In the first round, we pair the team 1 and 4, the teams 2 and 3 together, as we need to make the strong team and weak team together.

And we got (1, 4),(2, 3).

In the second round, the winners of (1, 4) and (2, 3) need to play again to generate the final winner, so you need to add the paratheses outside them.

And we got the final answer ((1,4),(2,3)).

### Example 2:

Input: <code style="color:rgba(239, 241, 246, 0.75);background-color:rgba(255, 255, 255, 0.07)">n == 8</code>&nbsp;

Output: "(((1,8),(4,5)),((2,7),(3,6)))"

Explanation:

- First round: (1, 8),(2, 7),(3, 6),(4, 5)
- Second round: ((1, 8),(4, 5)),((2, 7),(3, 6))
- Third round: (((1, 8),(4, 5)),((2, 7),(3, 6)))

Since the third round will generate the final winner, you need to output the answer (((1,8),(4,5)),((2,7),(3,6))).

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

<code style="color:rgba(239, 241, 246, 0.75);background-color:rgba(255, 255, 255, 0.07)">n == 2x</code>&nbsp;where&nbsp;<code style="color:rgba(239, 241, 246, 0.75);background-color:rgba(255, 255, 255, 0.07)">x</code>&nbsp;in in the range&nbsp;<code style="color:rgba(239, 241, 246, 0.75);background-color:rgba(255, 255, 255, 0.07)">[1, 12]</code>.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
