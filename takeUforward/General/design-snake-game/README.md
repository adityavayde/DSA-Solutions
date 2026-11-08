# [373. Design Snake GamePOTD](https://takeuforward.org/practice/dsa/design-snake-game)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Design a Snake game that is played on a device with screen size height x width. Play the game online if you are not familiar with the game.

The snake is initially positioned at the top left corner (0, 0) with a length of 1 unit.

You are given an array food where food[i] = (ri, ci) is the row and column position of a piece of food that the snake can eat. When a snake eats a piece of food, its length and the game's score both increase by 1.

Each piece of food appears one by one on the screen, meaning the second piece of food will not appear until the snake eats the first piece of food.

When a piece of food appears on the screen, it is guaranteed that it will not appear on a block occupied by the snake.

The game is over if the snake goes out of bounds (hits a wall) or if its head occupies a space that its body occupies after moving (i.e. a snake of length 4 cannot run into itself).

Implement the SnakeGame class:

- SnakeGame(int width, int height, int[][] food) Initializes the object with a screen of size height x width and the positions of the food.
- int move(String direction) Returns the score of the game after applying one direction move by the snake. If the game is over, return -1.

### Example 1:

**Input:** ["SnakeGame", "move", "move", "move", "move", "move", "move"]

[[3, 2, [[1, 2], [0, 1]]], ["R"], ["D"], ["R"], ["U"], ["L"], ["U"]]

**Output:** [null, 0, 0, 1, 1, 2, -1]

**Explanation:**

SnakeGame snakeGame = new SnakeGame(3, 2, [[1, 2], [0, 1]]);

snakeGame.move("R"); // return 0

snakeGame.move("D"); // return 0

snakeGame.move("R"); // return 1, snake eats the first piece of food. The second piece of food appears at (0, 1).

snakeGame.move("U"); // return 1

snakeGame.move("L"); // return 2, snake eats the second food. No more food appears.

snakeGame.move("U"); // return -1, game over because snake collides with border

### Example 2:

**Input:** ["SnakeGame", "move", "move", "move", "move"]

[2,2[,[0,1],[1,1],[1,0],[0,0]],["R"],["D"],["L"],["U"]]

**Output:** ; [null,1,2,3,4]

**Explanation:**

SnakeGame snakeGame = new SnakeGame(2, 2, [[0,1], [1,1], [1,0], [0,0]]);

snakeGame.move("R"); // return 1, snake moves right from (0,0) to (0,1) and eats the first food at (0,1). Score becomes 1.

snakeGame.move("D"); // return 2, snake moves down from (0,1) to (1,1) and eats the second food at (1,1). Score becomes 2.

snakeGame.move("L"); // return 3, snake moves left from (1,1) to (1,0) and eats the third food at (1,0). Score becomes 3.

snakeGame.move("U"); // return 4, snake moves up from (1,0) to (0,0) and eats the fourth food at (0,0). Score becomes 4.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= width, height <= 10^4
- 1 <= food.length <= 50
- food[i].length == 2
- 0 <= ri < height
- 0 <= ci < width
- direction.length == 1
- direction is 'U', 'D', 'L', or 'R'.
- At most 10^4 calls will be made to move.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
