import java.util.Arrays;

class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        long[] dp = new long[26]; // Tracks counts for subsequences ending in 'a'-'z'
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            
            // Calculate total current distinct subsequences + 1 (for the single character c itself)
            long total = 1;
            for (long count : dp) {
                total = (total + count) % MOD;
            }
            
            // Update the count for the current ending character
            dp[index] = total;
        }
        
        // Sum up all distinct subsequences
        long result = 0;
        for (long count : dp) {
            result = (result + count) % MOD;
        }
        
        return (int) result;
    }
}
