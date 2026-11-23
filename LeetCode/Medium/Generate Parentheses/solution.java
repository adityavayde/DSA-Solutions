class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, "", n, result);
        return result;
    }

    void backtrack(int open, int close, String current, int n, List<String> result) {
        if(open > n) return;

        if(open == close && open + close == 2 * n) {
            result.add(current);
            return;
        }

        backtrack(open + 1, close, current + '(', n, result);

        if(close < open) {
            backtrack(open, close + 1, current + ')', n, result);
        }
    }
}