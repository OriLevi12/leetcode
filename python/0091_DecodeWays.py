/**
At each index, I can either take the last one digit if it’s valid, or the last two digits if they form a number between 10 and 26.
This gives the recurrence dp[i] = dp[i-1] + dp[i-2] under those conditions.
The base cases are dp[0] = 1 and dp[1] depending on whether the first digit is valid. 
That leads naturally to a DP solution in O(n) time and O(n) space, and it can be optimized to O(1) space with two rolling variables.
 */

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // dp[i] = number of ways to decode the first i characters of s
        int[] dp = new int[n + 1];

        // Base cases:
        dp[0] = 1; // empty string → 1 way
        dp[1] = (s.charAt(0) == '0') ? 0 : 1; // first digit must not be '0'

        for (int i = 2; i <= n; i++) {
            // --- Option 1: take one digit (s[i-1]) ---
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // --- Option 2: take two digits (s[i-2..i-1]) ---
            int two = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            if (10 <= two && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        // Answer is the number of ways to decode the whole string
        return dp[n];
    }
}
