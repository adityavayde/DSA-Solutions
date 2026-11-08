class Solution {
    public String toggleCase(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z')
                result.append((char)(ch - 'a' + 'A'));

            else if (ch >= 'A' && ch <= 'Z')
                result.append((char)(ch - 'A' + 'a'));

            else
                result.append(ch);
        }

        return result.toString();
    }
}