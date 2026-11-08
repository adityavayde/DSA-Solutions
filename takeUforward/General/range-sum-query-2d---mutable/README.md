# [406. Range Sum Query 2D - MutablePOTD](https://takeuforward.org/practice/dsa/range-sum-query-2d---mutable?solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a 2D matrix matrix, handle multiple queries of the following types:

- Update the value of a cell in matrix.
- Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Implement the NumMatrix class:

- NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
- void update(int row, int col, int val) Updates the value of matrix[row][col] to be val.
- int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

### Example 1:

**Input:** ["NumMatrix", "sumRegion", "update", "sumRegion"] [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [3, 2, 2], [2, 1, 4, 3]]

**Output:** [null, 8, null, 10]

**Explanation:**

- NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]);
- numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e. sum of the left red rectangle)
- numMatrix.update(3, 2, 2);&nbsp;&nbsp;&nbsp;&nbsp;// matrix changes from left image to right image
- numMatrix.sumRegion(2, 1, 4, 3); // return 10 (i.e. sum of the right red rectangle)

### Example 2:

**Input:** ["NumMatrix", "update", "sumRegion", "update", "sumRegion"] [[[1, 1]], [0, 0, 980], [0, 0, 0, 0], [0, 0, -780], [0, 0, 0, 0]]

**Output:** [null, null, 980, null, -780]

**Explaination** :

- NumMatrix numMatrix = new NumMatrix([[1, 1]]); // Initialize the matrix as [[1, 1]]
- numMatrix.update(0, 0, 980);&nbsp;// Update the value at (0,0) from 1 to 980 // Updated matrix: [[980, 1]]
- numMatrix.sumRegion(0, 0, 0, 0); // Return the sum of the submatrix from (0,0) to (0,0) // Sum = 980
- numMatrix.update(0, 0, -780); // Update the value at (0,0) from 980 to -780&nbsp;// Updated matrix: [[-780, 1]]
- numMatrix.sumRegion(0, 0, 0, 0); // Return the sum of the submatrix from (0,0) to (0,0)// Sum = -780

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 200
- -1000 <= matrix[i][j] <= 1000
- 0 <= row < m
- 0 <= col < n
- -1000 <= val <= 1000
- 0 <= row1 <= row2 < m
- 0 <= col1 <= col2 < n
- At most 5000 calls will be made to sumRegion and update.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
