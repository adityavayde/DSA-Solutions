# [Find Salaries Outside the Expected Range](https://takeuforward.org/practice/sql/find-salaries-outside-the-expected-range?category=problem-level-1-filtering-essentials&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores employee salary information to monitor compensation fairness. The HR team wants to identify employees whose salaries fall outside an acceptable range.

Table: Employees

```
╔══════════╦══════════╗
║  Column  ║   Type   ║
╠══════════╬══════════╣
║  emp_id  ║   int    ║
║──────────┼──────────║
║   name   ║ varchar  ║
║──────────┼──────────║
║  salary  ║   int    ║
╚══════════╩══════════╝
```

- emp_id is the primary key.
- Each row represents one employee and their salary.

Write an SQL query to return all employees whose salary is NOT between 30,000 and 80,000 (inclusive).

Return: emp_id | name | salary

The result can be returned in any order.

### Example 1:

Input:

Employees:

```
╔══════════╦══════════╦══════════╗
║  emp_id  ║   name   ║  salary  ║
╠══════════╬══════════╬══════════╣
║    1     ║  Aarav   ║  25000   ║
║──────────┼──────────┼──────────║
║    2     ║   Neha   ║  30000   ║
║──────────┼──────────┼──────────║
║    3     ║  Rohan   ║  50000   ║
║──────────┼──────────┼──────────║
║    4     ║  Meera   ║  85000   ║
╚══════════╩══════════╩══════════╝
```

Output:

```
╔══════════╦══════════╦══════════╗
║  emp_id  ║   name   ║  salary  ║
╠══════════╬══════════╬══════════╣
║    1     ║  Aarav   ║  25000   ║
║──────────┼──────────┼──────────║
║    4     ║  Meera   ║  85000   ║
╚══════════╩══════════╩══════════╝
```

Explanation

- 30,000 and 80,000 are included in the valid range.
- Aarav earns less than 30,000, included.
- Meera earns more than 80,000, included.
- Neha and Rohan are inside the range, excluded.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
