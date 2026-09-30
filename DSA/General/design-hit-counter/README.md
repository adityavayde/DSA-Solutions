# [259. Design Hit CounterPOTD](https://takeuforward.org/practice/dsa/design-hit-counter)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Design a hit counter which counts the number of hits received in the past 5 minutes (i.e. the past 300 seconds).

Your system should accept a timestamp parameter (in seconds granularity), and you may assume that calls are being made to the system in chronological order (i.e., timestamp is monotonically increasing). Several hits may arrive roughly at the same time.

Implement the HitCounter class:

HitCounter() Initializes the object of the hit counter system.

void hit(int timestamp) Records a hit that happened at timestamp (in seconds). Several hits may happen at the same timestamp.

- int getHits(int timestamp) Returns the number of hits in the past 5 minutes from timestamp (i.e., the past 300 seconds).

### Example 1:

**Input:** ["HitCounter", "hit", "hit", "hit", "getHits", "hit", "getHits", "getHits"]

[[], [1], [2], [3], [4], [300], [300], [301]]

**Output:** [null, null, null, null, 3, null, 4, 3]

**Explanation:**

- HitCounter hitCounter = new HitCounter();
- hitCounter.hit(1);&nbsp;&nbsp;&nbsp;&nbsp;// hit at timestamp 1.
- hitCounter.hit(2);&nbsp;&nbsp;&nbsp;&nbsp;// hit at timestamp 2.
- hitCounter.hit(3);&nbsp;&nbsp;&nbsp;&nbsp;// hit at timestamp 3.
- hitCounter.getHits(4);&nbsp;&nbsp;// get hits at timestamp 4, return 3.
- hitCounter.hit(300);&nbsp;&nbsp;&nbsp;// hit at timestamp 300.
- hitCounter.getHits(300); // get hits at timestamp 300, return 4.
- hitCounter.getHits(301); // get hits at timestamp 301, return 3.

### Example 2:

**Input:** ["HitCounter","getHits","hit","getHits"]

[[],[8],[20],[42]]

**Output:** [null,0,null,1]

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= timestamp <= 2 * 10^9
- All the calls are being made to the system in chronological order (i.e., timestamp is monotonically increasing).
- At most 300 calls will be made to hit and getHits.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
