class SnakeGame {
    private int w, h; 
    private int[][] food; 
    private int foodPos; 
    private Deque<int[]> snake; 

    public SnakeGame(int width, int height, int[][] food) {
        w = width;
        h = height;
        foodPos = 0;
        this.food = food;
        snake = new LinkedList<>();
        snake.addFirst(new int[]{0, 0}); 
    }

    public int move(String direction) {
        int[] head = snake.getFirst();
        int i = head[0]; 
        int j = head[1]; 

        // Update head position based on direction
        if (direction.equals("U")) i--;
        else if (direction.equals("L")) j--;
        else if (direction.equals("R")) j++;
        else if (direction.equals("D")) i++;

        // Check if the new position is out of bounds
        if (i < 0 || i >= h || j < 0 || j >= w) return -1;

        int[] temp = new int[]{i, j};

        // Check if the snake collides with itself
        for (int[] segment : snake) {
            if (segment[0] == temp[0] && segment[1] == temp[1]) {
                // Allow collision if it's the tail 
                if (temp[0] != snake.getLast()[0] || temp[1] != snake.getLast()[1]) {
                    return -1;
                }
            }
        }

        // Check if the snake eats food
        if (foodPos < food.length && i == food[foodPos][0] 
        && j == food[foodPos][1]) {
            foodPos++; 
        } 
        // Remove tail if no food eaten
        else {
            snake.removeLast(); 
        }
        snake.addFirst(temp); 
        return foodPos;
    }
}
