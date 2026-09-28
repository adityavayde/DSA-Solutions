class Solution {
    public String findContestMatch(int n) {
        List<String> teams = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            teams.add(String.valueOf(i));
        }
        
        while (teams.size() > 1) {
            List<String> nextRound = new ArrayList<>();
            int left = 0, right = teams.size() - 1;
            while (left < right) {
                nextRound.add("(" + teams.get(left) + "," + teams.get(right) + ")");
                left++;
                right--;
            }
            teams = nextRound;
        }
        return teams.get(0);
    }
}