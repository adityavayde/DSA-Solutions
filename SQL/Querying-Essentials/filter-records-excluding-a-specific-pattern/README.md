# [Filter Records Excluding a Specific Pattern](https://takeuforward.org/practice/sql/filter-records-excluding-a-specific-pattern?category=problem-level-1-filtering-essentials&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores customer email addresses and wants to identify users who are NOT using a particular email domain.

This helps the analytics team understand external user distribution.

Table: Users

```
╔══════════╦══════════╗
║  Column  ║   Type   ║
╠══════════╬══════════╣
║ user_id  ║   int    ║
║──────────┼──────────║
║   name   ║ varchar  ║
║──────────┼──────────║
║  email   ║ varchar  ║
╚══════════╩══════════╝
```

- user_id is the primary key.
- Each row represents one user and their registered email.

Write an SQL query to return all users whose email does NOT end with @gmail.com.

Return: user_id | name | email

Result can be returned in any order.

### Example 1:

Input:

Users:

```
╔══════════╦══════════╦═══════════════════╗
║ user_id  ║   name   ║       email       ║
╠══════════╬══════════╬═══════════════════╣
║    1     ║  Aarav   ║  aarav@gmail.com  ║
║──────────┼──────────┼───────────────────║
║    2     ║   Neha   ║  neha@yahoo.com   ║
║──────────┼──────────┼───────────────────║
║    3     ║  Rohan   ║  rohan@gmail.com  ║
║──────────┼──────────┼───────────────────║
║    4     ║  Meera   ║ meera@outlook.com ║
╚══════════╩══════════╩═══════════════════╝
```

Output:

```
╔══════════╦══════════╦═══════════════════╗
║ user_id  ║   name   ║       email       ║
╠══════════╬══════════╬═══════════════════╣
║    2     ║   Neha   ║  neha@yahoo.com   ║
║──────────┼──────────┼───────────────────║
║    4     ║  Meera   ║ meera@outlook.com ║
╚══════════╩══════════╩═══════════════════╝
```

Explanation:

- Emails ending with @gmail.com are excluded.
- Only non-gmail users remain.

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
