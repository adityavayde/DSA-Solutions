class NumMatrix {
    private int[][] data;
    public NumMatrix(int[][] matrix) {
        data = matrix;
    }
    public void update(int row, int col, int val) {
        data[row][col] = val;
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        // Iterate over rows from row1 to row2
        for (int r = row1; r <= row2; r++) {
            // Iterate over columns from col1 to col2
            for (int c = col1; c <= col2; c++) {
                sum += data[r][c];
            }
        }
        return sum;
    }
}