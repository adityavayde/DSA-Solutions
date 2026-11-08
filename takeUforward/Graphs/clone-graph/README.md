# [47. Clone Graph
POTD](https://takeuforward.org/practice/dsa/clone-graph)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

You are given a reference to a node in a connected undirected graph. Each node has a value val (unique integer from 1 to 100) and a list of neighbors.

Return a deep copy (clone) of the graph. The cloned graph should have the same structure and values, but with entirely new nodes.

Each Node defined as:

```
class Node {
    public int val;
    public List<Node> neighbors;
}
```

### Example 1:

**Input:** adjList = [[2,4],[1,3],[2,4],[1,3]]

**Output:** [[2,4],[1,3],[2,4],[1,3]]

**Explanation:**

There are 4 nodes in the graph:

- Node 1 connects to nodes 2 and 4

- Node 2 connects to nodes 1 and 3

- Node 3 connects to nodes 2 and 4

- Node 4 connects to nodes 1 and 3

The cloned graph has the same structure as the original.

### Example 2:

**Input:** adjList = [[2,3],[1,3],[1,2]][[]]

**Output:** [[2,3],[1,3],[1,2]][[]]

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- The number of nodes is in the range [0, 100]
- 1 <= Node.val <= 100
- Each node’s val is unique
- No duplicate edges or self-loops
- The graph is connected and can be visited entirely starting from node 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
