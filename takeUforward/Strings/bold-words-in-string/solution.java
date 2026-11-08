class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[128];
        isEnd = false;
    }
    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            if (node.children[c] == null) {
                node.children[c] = new Trie();
            }
            node = node.children[c];
        }
        node.isEnd = true;
    }
}
class Solution {
    public String boldWords(String[] words, String s) {
        Trie trie = new Trie();
        for (String w : words) {
            trie.insert(w);
        }

        int n = s.length();
        List<int[]> intervals = new ArrayList<>();

        // Find all matching substrings
        for (int i = 0; i < n; i++) {
            Trie node = trie;
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j);
                if (node.children[idx] == null) break;
                node = node.children[idx];
                if (node.isEnd) {
                    intervals.add(new int[]{i, j});
                }
            }
        }

        if (intervals.isEmpty()) return s;

        // Merge intervals
        intervals.sort((a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int start = intervals.get(0)[0], end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {
            int a = intervals.get(i)[0], b = intervals.get(i)[1];
            if (end + 1 < a) {
                merged.add(new int[]{start, end});
                start = a;
                end = b;
            } else {
                end = Math.max(end, b);
            }
        }
        merged.add(new int[]{start, end});

        // Build the result string
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < n) {
            if (j == merged.size()) {
                result.append(s.substring(i));
                break;
            }
            start = merged.get(j)[0];
            end = merged.get(j)[1];
            if (i < start) {
                result.append(s.substring(i, start));
            }
            result.append("<b>").append(s.substring(start, end + 1)).append("</b>");
            i = end + 1;
            j++;
        }
        return result.toString();
    }
}
