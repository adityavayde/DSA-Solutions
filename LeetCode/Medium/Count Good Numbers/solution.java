class Solution {

    static final int M = (int) 1e9 + 7;

    private long findPower(long a, long b) {
        if (b == 0)
            return 1;

        long ans = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % M;
                b -= 1;
            } else {
                a = a * a % M;
                b = b / 2;
            }
        }

        return ans;
    }

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long result = (findPower(5, evenCount) * findPower(4, oddCount)) % M;
        return (int) result;
    }
}