# [Find Records Excluding a Given Set of Values](https://takeuforward.org/practice/sql/find-records-excluding-a-given-set-of-values?category=problem-level-1-filtering-essentials&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An e-commerce platform tracks customer orders. Some orders are marked as cancelled or returned, and the business team wants to analyze only the valid orders.

Table: Orders

```
╔═════════════╦══════════╗
║   Column    ║   Type   ║
╠═════════════╬══════════╣
║  order_id   ║   int    ║
║─────────────┼──────────║
║ customer_id ║   int    ║
║─────────────┼──────────║
║   status    ║ varchar  ║
╚═════════════╩══════════╝
```

- order_id is the primary key.
- Each row represents one order.
- status can be values like: 'Completed', 'Cancelled', 'Returned', 'Pending', 'Shipped', 'Processing'.

Write an SQL query to return all orders whose status is NOT:

- 'Cancelled'
- 'Returned'

Return: order_id | customer_id | status

Result can be returned in any order.

### Example 1:

Input:

Orders:

```
╔══════════╦═════════════╦═══════════╗
║ order_id ║ customer_id ║  status   ║
╠══════════╬═════════════╬═══════════╣
║    1     ║     101     ║ Completed ║
║──────────┼─────────────┼───────────║
║    2     ║     102     ║ Cancelled ║
║──────────┼─────────────┼───────────║
║    3     ║     103     ║ Returned  ║
║──────────┼─────────────┼───────────║
║    4     ║     104     ║  Pending  ║
╚══════════╩═════════════╩═══════════╝
```

Output:

```
╔══════════╦═════════════╦═══════════╗
║ order_id ║ customer_id ║  status   ║
╠══════════╬═════════════╬═══════════╣
║    1     ║     101     ║ Completed ║
║──────────┼─────────────┼───────────║
║    4     ║     104     ║  Pending  ║
╚══════════╩═════════════╩═══════════╝
```

Explanation:

Orders with status Cancelled and Returned are excluded.

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
