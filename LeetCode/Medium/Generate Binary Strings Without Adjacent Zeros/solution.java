class Solution {
    private void generateString(String s, int n, List<String> ans) {
        if(s.length() == n) {
            ans.add(s);
            return;
        }

        if(s.isEmpty() || s.charAt(s.length() - 1) != '0') {
            s = s + "0";
            generateString(s, n, ans);
            s = s.substring(0, s.length() - 1);
        }

        s = s + "1";
        generateString(s, n, ans);
        
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generateString("", n, ans);
        return ans;
    }
}