class Solution {
    int subsequenceSum(String s) {
        final long MOD = 1_000_000_007L;
        int n = s.length();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
        }
        sum %= MOD;

        // 2^(n-1) mod MOD
        long pow = 1;
        for (int i = 1; i < n; i++) {
            pow = (pow * 2) % MOD;
        }

        return (int) ((sum * pow) % MOD);
    }
}