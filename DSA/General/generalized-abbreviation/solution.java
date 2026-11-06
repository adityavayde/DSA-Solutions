class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> ret = new ArrayList<>();
        int n = word.length();
        // Iterate through all possible bitmasks
        for (int mask = 0; mask < (1 << n); mask++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                // Check if the i-th bit is set in the mask
                if (((1 << i) & mask) != 0) {
                    count++;
                } else {
                    // If count > 0, append it to the abbreviation
                    if (count != 0) {
                        sb.append(count);
                        count = 0;
                    }
                    /* Append the current character if 
                    it's within the word length */
                    if (i < n) sb.append(word.charAt(i));
                }
            }
            ret.add(sb.toString());
        }
        return ret;
    }
}