class Solution {
    public int countQuadruples(String firstString, String secondString) {

        int minDiff = Integer.MAX_VALUE;

        int res = 0;

        HashMap<Character, Integer> secondIndex = new HashMap<>();

        for (int i = 0; i < secondString.length(); ++i) {
            secondIndex.put(secondString.charAt(i), i);
        }

        for (int i = 0; i < firstString.length(); ++i) {

            char c = firstString.charAt(i);

            if (secondIndex.containsKey(c)) {

                int diff = i - secondIndex.get(c);

                res = diff == minDiff ? res + 1 :

                diff < minDiff ? 1 : res;

                minDiff = Math.min(diff, minDiff);
            }
        }

        return res;
    }
}
